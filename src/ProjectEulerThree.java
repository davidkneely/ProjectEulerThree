import java.util.ArrayList;
import java.util.List;

/**
 * Computes the prime factors of long number.
 */
public class ProjectEulerThree {
  /**
   * Computes the prime factors of a long number.
   * @param args Ignored.
   */
  public static void main(String[] args) {
    List<Long> returnList = computePrimeFactors(600851475143L);
  }

  /**
   * Computes the prime factors of a long number and returns an ArrayList of the prime factors.
   * @param inputNumber The long input number.
   * @return The ArrayList of prime factors.
   */
  public static List<Long> computePrimeFactors(long inputNumber) {
    long num = inputNumber;
    List<Long> factors = new ArrayList<>();
    long divider = 2;
    while (num > 1) {
      while ((num % divider) == 0) {
        factors.add(divider);
        num /= divider;
      }
        divider += 1;
    }
    //System.out.println(factors.toString());
    return factors;
  }
}
