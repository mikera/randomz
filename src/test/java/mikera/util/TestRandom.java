package mikera.util;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Random;

import mikera.randomz.Randomz;

public class TestRandom {
	@Test public void testSameSequence() {
		Random r1=Randomz.getGenerator(0xCAFEBABE);
		Random r2=((mikera.util.Random)r1).clone();
		
		for (int i=0; i<100; i++) {
			assertEquals(r1.nextLong(),r2.nextLong());
		}
	}
}
