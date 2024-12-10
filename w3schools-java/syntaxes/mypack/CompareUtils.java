package mypack;

// Showcase Enum and Method overload
// Enum can hold different "status" of an object, 
// They are just strings represent real world concepts 

// 2 methods can have the same name, but different output and param's types
//  It's called "overloading"
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
