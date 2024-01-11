import java.util.Scanner; // user input

class Employee {
  private int age;
  private String name;
  private float seniority;

  public Employee(
    int age,
    String name,
    float seniority
  ){
    this.age=age;
    this.name=name;
    this.seniority=seniority;
  }

  // encapsulation => security 
  //   and allow more modification in the future
  String getName(){return this.name;};
  int getAge(){return this.age;};
  float getSeniority(){return this.seniority;};
}

enum CompareResult {
  HIGHER, EQUAL, LOWER
}

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");

    // static methods can be called without instance  
    numbersTypes(); // can be called directly
    typeCasting();
    stringManipulations();
    Main.mathOperations(); // or like a static method of another class
    Main.ifElseStatement("Never gonna give you up");
    Main.switchStatementChatGPTexpression();


    // non-static methods needs to be called will an instace.
    // This.whileLoopThreadWait() is also not allowed
    //    because `main` is a static method, cant call instance's attributes and methods
    Main MainInstance = new Main();
    MainInstance.whileLoopThreadWait();
    MainInstance.forLoop();

    Employee
      empL = new Employee(23, "Huy", 1.6f),
      empR = new Employee(23, "Dzung", 2f);
    System.out.println(compare(empL, empR));
    System.out.println(compare(2, 3));
  };

  void printUserInput(){
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username: ");
    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
    myObj.close();
  }

  static CompareResult compare(Employee empLeft, Employee empRight){
    if (empLeft.getSeniority() > empRight.getSeniority()){
      return CompareResult.HIGHER;
    } else if (empLeft.getSeniority() == empRight.getSeniority()){
      return CompareResult.EQUAL;
    } else{
      return CompareResult.LOWER;
    }
  }

  static CompareResult compare(int numLeft, int numRight){
    if (numLeft > numRight){
      return CompareResult.HIGHER;
    } else if (numLeft == numRight){
      return CompareResult.EQUAL;
    } else{
      return CompareResult.LOWER;
    }
  }

  static void printSection(String sectionName){
    // System.out use the buffer
    // not like Python, will flush the buffer every newline character
    // this object does not.
    // and sometimes will return intervened output in the console.
    // especially when the string is long, and formatting is complex
    System.out.printf("\n_____ Section : %s \n",sectionName);
  };

  static void numbersTypes(){
    Main.printSection("Numbers Types");
    float f1 = 35E3f;
    double d1 = 12e4d; // "E" and "e" are both "exponential", not case sensitive
    System.out.println(f1);
    System.out.println(d1);
  };

  static void typeCasting(){
    Main.printSection("Type Casting");

    // char must be surrounded by single quote ''
    char charH = 'H';

    // this is "widening", type char is smaller than type "int"
    // auto convert char into ASCII index of the character
    int charHIndexASCII = charH;

    // this is "narrowing", type "short" is smaller than type "int"
    // will eveluate at runtime
    // might throw error if value is bigger than converted type.
    short smallerNumber = (short) charHIndexASCII;

    System.out.println(smallerNumber);
  };

  static void stringManipulations(){
    Main.printSection("String manipulation");
    String stringToManipulate = "Never gonna give you up";
    System.out.println(
      "The length of my first Java String is "+stringToManipulate.length()
    );
    System.out.printf(
      "The uppercase version of my first Java String is %s\n and the lowecase version is %s\n",
      stringToManipulate.toUpperCase(),
      stringToManipulate.toLowerCase()
    );
    System.out.println(
      "The index of the word 'up' is "+
      stringToManipulate.indexOf("up")
    );
  }

  static void mathOperations(){
    Main.printSection("Math");
    System.out.println(
      "The quare root of 4.7 is "
      + Math.sqrt(4.7f) // default return is double
    );
  };

  static void ifElseStatement(String lyric){
    Main.printSection( "if else");
    if (lyric == "Never gonna give you up"){
      System.out.println("Never gonna let you down");
    }else{
      System.out.println("*Wrong song!");
    };
  };

  static void switchStatementChatGPTexpression(){
    Main.printSection("switch statement (match)");
    // Using a single expression in the switch
    // brilliant combined statement, suggested by ChatGPT
    int myAge = 23;
    boolean amIGrinding = true;
    switch (myAge * 10 + (amIGrinding ? 1 : 0)) {
        case 231:
            System.out.println("I will champion one day");
            break;
            // "break" is optional, when this case is valid 
            // and you don't want the other cases to be validate anymore
        case 240:
            System.out.println("Get your ass up, you are not done yet!");
            break;
        default: // (optional) if no valid cases to switch
            System.out.println("Chill Bro!");
    };
  };

  void whileLoopThreadWait(){
    Main.printSection("while statement");
    int countNum = 5;
    int secondsToSleep = 1;
    while (countNum > 0){
      System.out.println(countNum);
      try {
        // stop thread for 1 second
        Thread.sleep(secondsToSleep * 1000);
      } catch (InterruptedException ie) {
        // when thread is stopping
        // other might interupt this Thread
        // causing InterruptedException
        Thread.currentThread().interrupt();
      };
      countNum--;
    }
    System.out.println("BOOOOM!");
  };

  void forLoop(){
    Main.printSection("for loop, for each loop");
    for (int i=2; i<=10; i+=2){
      // print even numbers from 0 to 10
      System.out.println("Event number: "+i);
    };
    // for each loop
    String[][] employees = {
      {"Huy", "Team Wakandata"},
      {"Dzung", "Team Wakandata"},
      {"Huyen", "Div X"},
      {"Binh", "Div SBC"},
    };
    System.out.printf("There are %d employees\n", employees.length);
    for (String[] employeeTeam: employees){
      System.out.printf(
          "Member: %s from %s\n",
          employeeTeam[0],
          employeeTeam[1]
        );
    };
  };
}

