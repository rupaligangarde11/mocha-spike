package main.probability;

import junit.framework.TestCase;
import main.probability.Probability;
import org.junit.Test;

public class ProbabilityTest extends TestCase {
    Probability probability=new Probability(1,6);
    @Test
    public void testCalculateProbabilityForGeting6() {
        assertEquals(0.17,probability.calculateProbability());
    }
}