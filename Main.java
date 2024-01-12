import mypack.EmployeePosition.Developer;
import mypack.EmployeePosition.TechLead;
import mypack.EmployeePosition.Manager;
import mypack.CompareUtils;
import mypack.Employee;
import mypack.BasicJava;
import mypack.LearnDateTime;
import mypack.CommonUtils;
import mypack.LearnArray;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");

    // static methods can be called without instance
    numbersTypes(); // can be called directly
    BasicJava.typeCasting(); // or a static method of another class
    BasicJava.stringManipulations();
    BasicJava.mathOperations();
    BasicJava.ifElseStatement("Never gonna give you up");
    BasicJava.switchStatementChatGPTexpression();

    // non-static methods needs to be called will an instace.
    // This.whileLoopThreadWait() is also not allowed
    // because `main` is a static method, cant call instance's attributes and
    // methods
    BasicJava BasicInstance = new BasicJava();
    BasicInstance.whileLoopThreadWait();
    BasicInstance.forLoop();

    // interfaces, abstractions
    Developer empL = new Developer(23, "Huy", 1.6f);
    TechLead empR = new TechLead(23, "Dzung", 2f);
    Manager newManager = new Manager(37, "Mickola", 8f);
    
    // overloaded function "compare"
    System.out.println(CompareUtils.compare(empL, empR));
    // can be used with int or `Employee` object
    System.out.println(CompareUtils.compare(2, 3));

    // Array stream
    Employee[] allEmployees = {empL, empR, newManager};
    LearnArray.employeesMostSenority(allEmployees);

    // user input
    BasicInstance.printUserInput();
    
    // datetime
    LearnDateTime.testLearn();

    // Array string list
  };

  static void numbersTypes() {
    CommonUtils.printSection("Numbers Types");
    float f1 = 35E3f;
    double d1 = 12e4d; // "E" and "e" are both "exponential", not case sensitive
    System.out.println(f1);
    System.out.println(d1);
  };
}
