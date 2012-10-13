package mikera.randomz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import mikera.randomz.ProbabilityPicker;

import org.junit.Test;

public class TestProbPicker {
	@Test public void testOrders() {
		for (int i=0; i<100; i++) {
			assertEquals(i,ProbabilityPicker.parentIndex(ProbabilityPicker.childIndex(i,0)));
			assertEquals(i,ProbabilityPicker.parentIndex(ProbabilityPicker.childIndex(i,1)));
		}
	}
	
	@Test public void testParent() {
		assertEquals(-1,ProbabilityPicker.parentIndex(0));
		assertEquals(1, ProbabilityPicker.order(0));
	}
	
	@Test public void testAddAndRemove() {
		ProbabilityPicker<Integer> p=new ProbabilityPicker<Integer>();
		
		p.add(Integer.valueOf(1),0.5);
		
		assertEquals(0.5,p.getTotal(),0.001);
		assertEquals(1,p.getCount(),0.001);
		
		p.remove(Integer.valueOf(1));
		
		assertEquals(0,p.getTotal(),0.001);
		assertEquals(0,p.getCount(),0.001);
	}
	
	@Test public void testAddAndRemoveLots() {
		ProbabilityPicker<Integer> p=new ProbabilityPicker<Integer>();
		
		for (int i=1; i<=100; i++) {
			p.add(Integer.valueOf(i),i);	
			assertEquals(i,p.getCount());
		}
		
		assertEquals(5050,p.getTotal(),0.001);
		
		for (int i=1; i<=100; i++) {
			p.remove(Integer.valueOf(i));
		}	
		
		assertEquals(0,p.getTotal(),0.001);
		assertEquals(0,p.getCount());
	}
	
	@Test public void testPicking() {
		ProbabilityPicker<Integer> p=new ProbabilityPicker<Integer>();
		
		for (int i=0; i<10; i++) {
			p.add(Integer.valueOf(i),100);	
		}
		
		assertEquals(1000,p.getTotal(),0.001);
		
		int[] hits=new int[10];
		for (int i=0; i<1000; i++) {
			hits[p.pick().intValue()]++;
		}
		
		assertTrue(hits[0]>50);
		assertTrue(hits[9]>50);
	}
}
