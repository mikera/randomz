package mikera.randomz;

import static org.junit.Assert.*;

import mikera.randomz.Probabilities;

import org.junit.Test;

public class TestProbabilities {

	@Test
	public void testLogProbabilityChance() {
		assertEquals(1.0,Probabilities.logProbabilityChance(-10, -Double.MAX_VALUE),0.0001);
		assertEquals(0.0,Probabilities.logProbabilityChance(-Double.MAX_VALUE, -10),0.0001);
		assertEquals(0.5,Probabilities.logProbabilityChance(-1,-1),0.0001);
		assertEquals(0.5,Probabilities.logProbabilityChance(-100,-100),0.0001);
		assertEquals(0.5,Probabilities.logProbabilityChance(-1000000,-1000000),0.0001);
		assertEquals(0.5,Probabilities.logProbabilityChance(-Double.MAX_VALUE,-Double.MAX_VALUE),0.0001);
	}

}
