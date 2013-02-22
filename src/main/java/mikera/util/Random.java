package mikera.util;

import mikera.randomz.Hash;

/**
 * Implementation of Random class using XORShift RNG
 * 
 * @author Mike Anderson
 *
 */
public final class Random extends java.util.Random {
	private static final long serialVersionUID = 6868944865706425166L;

	private volatile long state=System.nanoTime()|1;
	
	protected int next(int bits) {
		return (int)(nextLong()>>>(64-bits));
	}
	
	public long nextLong() {
		long a=state;
		state=Rand.xorShift64(a);
		return a;
	}
	
	public void setSeed(long seed) {
		if (seed==0) seed=54384849948L;
		state=seed;
	}
	
	public long getSeed() {
		return state;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Random) {
			return equals((Random)o);
		}
		return super.equals(o);
	}
	
	public boolean equals(Random o) {
		return state==o.state;
	}
	
	public int hashCode() {
		return Hash.hashCode(state);
	}
}