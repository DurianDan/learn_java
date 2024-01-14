import mypack.EmployeePosition.Developer;
import mypack.EmployeePosition.TechLead;
import mypack.LearnThreads.PredictableThread;
import mypack.LearnThreads.UnpredictableThread;
import mypack.EmployeePosition.Manager;
import mypack.CompareUtils;
import mypack.Employee;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;

import mypack.BasicJava;
import mypack.LearnDateTime;
import mypack.LearnFileHandling;
import mypack.LearnHashMap;
import mypack.CommonUtils;
import mypack.LearnArray;
import mypack.TemperatureMeasurement;

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
    // BasicInstance.whileLoopThreadWait();
    BasicInstance.forLoop();
    // interfaces, abstractions
    Developer empL = new Developer(23, "Huy", 1.6f);
    TechLead empR = new TechLead(23, "Dzung", 2f);
    Manager newManager = new Manager(37, "Mickola", 8f);
    // overloaded function "compare"
    System.out.println(CompareUtils.compare(empL, empR));
    // can be used with int or `Employee` object
    System.out.println(CompareUtils.compare(2, 3));
    // user input
    BasicInstance.printUserInput();
    // datetime
    LearnDateTime.testLearn();
    // Array stream
    Employee[] allEmployees = {empL, empR, newManager};
    LearnArray.employeesMostSenority(allEmployees);
    // Array string list
    LearnArray.leanrArrayList();
    // Lambda exressions
    LearnArray.printEmployeePositions(allEmployees);
    // HashMap
    LearnHashMap.testLearn();
    // Threads
    UnpredictableThread threadNono = new UnpredictableThread();
    PredictableThread threadGood = new PredictableThread();
    threadNono.testThread();
    threadGood.testThread();
    // File handling
    String fileName = "meomeo.text";
    LearnFileHandling.createFile(fileName);
    LearnFileHandling.writeFile(fileName);
    LearnFileHandling.readFile(fileName);
    // `record` keyword
    TemperatureMeasurement testTemperature = new TemperatureMeasurement(
      "Hanoi", 25.5f, LocalDateTime.now()
    );
    System.out.println(testTemperature);
  };

  static void numbersTypes() {
    CommonUtils.printSection("Numbers Types");
    float f1 = 35E3f;
    double d1 = 12e4d; // "E" and "e" are both "exponential", not case sensitive
    System.out.println(f1);
    System.out.println(d1);
  };
}
