package main;

import junit.framework.TestCase;
import org.junit.Test;

public class ProbabilityTest extends TestCase {
    Probability probability=new Probability(1,6);
    @Test
    public void testCalculateProbabilityForGeting6() {
        assertEquals(0.17,probability.calculateProbability());
    }
}