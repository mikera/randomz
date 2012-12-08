package mikera.randomz;

/**
 * Static pseudo-random hash functions
 * 
 * @author Mike
 */
public class Hash {
	public static final long longHash(long a) {
		a ^= (a << 21);
		a ^= (a >>> 35);
		a ^= (a << 4);
		return a;
	}
	
	public static final long hash (double x) {
		return longHash(longHash(
				0x8000+Long.rotateLeft( longHash(Double.doubleToRawLongBits(x)),17)));
	}
	
	public static final long hash (double x, double y) {
		return longHash(longHash(
				hash(x)+Long.rotateLeft(longHash(Double.doubleToRawLongBits(y)),17)));
	}
	
	public static final long hash (double x, double y, double z) {
		return longHash(longHash(
				hash(x,y)+Long.rotateLeft(longHash(Double.doubleToRawLongBits(z)),17)));
	}
	
	public static final long hash (double x, double y, double z, double t) {
		return longHash(longHash(
				hash(x,y,z)+Long.rotateLeft(longHash(Double.doubleToRawLongBits(t)),17)));
	}
	
	private static final double LONG_SCALE_FACTOR=1.0/(Long.MAX_VALUE+1.0);
	
	public static final double dhash(double x) {
		long h = hash(x);
		return (h&Long.MAX_VALUE)*LONG_SCALE_FACTOR;
	}
	
	public static final double dhash(double x, double y) {
		long h = hash(x,y);
		return (h&Long.MAX_VALUE)*LONG_SCALE_FACTOR;
	}
	
	public static final double dhash(double x, double y, double z) {
		long h = hash(x,y,z);
		return (h&Long.MAX_VALUE)*LONG_SCALE_FACTOR;
	}
	
	public static final double dhash(double x, double y , double z, double t) {
		long h = hash(x,y,z,t);
		return (h&Long.MAX_VALUE)*LONG_SCALE_FACTOR;
	}

}
