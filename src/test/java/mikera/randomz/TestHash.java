package mikera.randomz;

import static org.junit.Assert.assertEquals;
import mikera.randomz.Hash;

import org.junit.Test;

public class TestHash {
	@Test public void testHash() {
		for (int i=0; i<10; i++) {
			double v=Math.sqrt(i);
			assertEquals(new Double(v).hashCode(),Hash.hashCode(v));
		}
	}
}
