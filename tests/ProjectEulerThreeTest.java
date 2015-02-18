import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Tests ProjectEulerThree for input of long number that returns an ArrayList of prime factors.
 */
public class ProjectEulerThreeTest {
  /**
   * Tests ProjectEulerThree for input of long number that returns an ArrayList of prime factors.
   * @throws Exception Ignored.
   */
  @Test
  public void testComputePrimeFactors() throws Exception {
    ArrayList<Long> returnArray = new ArrayList<>();
    returnArray.add(2L);
    returnArray.add(2L);
    returnArray.add(2L);
    returnArray.add(2L);
    assertEquals("tests computerPrimeFactors with 16", returnArray, ProjectEulerThree.computePrimeFactors(16));
  }
}