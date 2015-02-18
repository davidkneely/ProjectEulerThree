import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidneely on 2/18/15.
 */
public class ProjectEulerThree {
  public static void main(String[] args) {
    computePrimeFactors(600851475143L);
  }

  public static void computePrimeFactors(long inputNumber) {
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
    System.out.println(factors.toString());
  }
}
