package mypack;

public class CompareUtils {
  public enum CompareResult {
    HIGHER, EQUAL, LOWER
  }

  public static CompareResult compare(Employee empLeft, Employee empRight) {
    if (empLeft.getSeniority() > empRight.getSeniority()) {
      return CompareResult.HIGHER;
    } else if (empLeft.getSeniority() == empRight.getSeniority()) {
      return CompareResult.EQUAL;
    } else {
      return CompareResult.LOWER;
    }
  }

  public static CompareResult compare(int numLeft, int numRight) {
    if (numLeft > numRight) {
      return CompareResult.HIGHER;
    } else if (numLeft == numRight) {
      return CompareResult.EQUAL;
    } else {
      return CompareResult.LOWER;
    }
  }
}
