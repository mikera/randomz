package performance;

import com.google.caliper.Runner;
import com.google.caliper.SimpleBenchmark;

public class Benchmark extends SimpleBenchmark {
	private final mikera.util.Random mr=new mikera.util.Random();
	private final java.util.Random jr=new java.util.Random();
	
	@SuppressWarnings("unused")
	public void timeJavaRandom(int reps) {
		for (int i=0; i<reps; i++) {
			double l=jr.nextLong();
		}
	}
	
	@SuppressWarnings("unused")
	public void timeMikeraRandom(int reps) {
		for (int i=0; i<reps; i++) {
			double l=mr.nextLong();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Benchmark().run();
	}

	private void run() {
		new Runner().run(new String[] {this.getClass().getCanonicalName()});
	}


}
