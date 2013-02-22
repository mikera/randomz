package mikera.randomz;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import mikera.randomz.Hash;

import org.junit.Test;

public class TestHash {
	@Test public void testHash() {
		for (int i=0; i<10; i++) {
			double v=Math.sqrt(i);
			assertEquals(new Double(v).hashCode(),Hash.hashCode(v));
		}
	}
	
	@Test
	public void testDoubleHash() {
		assertEquals(0,Hash.hashCode(0.0));
		assertEquals(1,Hash.zeroVectorHash(0));
		assertEquals(31,Hash.zeroVectorHash(1));
		
		for (int i=0; i<100; i++) {
			ArrayList<Double> al=new ArrayList<Double>();
			for (int j=0; j<i; j++) {
				al.add(0.0);
			}
			
			assertEquals(Hash.zeroVectorHash(i),al.hashCode());
		}
	}
	
	
	@Test public void testZeroVectorHash() {
		assertEquals(1,Hash.zeroVectorHash(0));
		assertEquals(31,Hash.zeroVectorHash(1));
	}
}
