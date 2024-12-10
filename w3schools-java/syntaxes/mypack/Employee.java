package mypack;

// public, abstract, static, final, private are "modifiers"
// Public class is accessable in anywhere, default is only accessed inside the package 
// abstract class is meant to be inherited, can not create instances
public abstract class Employee {
  // Pivate attributes and methods can only be used by the class, not outside
  private int age;
  private String name;
  private float seniority;
  // Static attributes are shared by all the instances of the class
  // Here, we implement an employees object counter
  // by using the statis attributes emloyeeCreated and increase it inside the constructor.
  private static int employeeCreated = 0;
  // The final keyword make a class can not be inherited
  // and make an attributes/variable can not be modified.
  // Usually for configuration.
  private static final int COMPANY_BASE_SENIORITY = 2;
  public abstract String getPosition();

  // a Constructor Method
  // is called when the "construct" the instance of the object
  //  has the object's name, and doesn't have the return type (even "void")
  public Employee(
      int age,
      String name,
      float seniority) {
    this.age = age;
    this.name = name;
    this.seniority = seniority;
    employeeCreated ++;
  }

  public int getEmployeeCreated(){
    return employeeCreated;
  }

  public boolean isIntern(){
    return this.seniority < COMPANY_BASE_SENIORITY;
  }

  // encapsulation => security
  // and allow more modification in the future
  public String getName() {
    return this.name;
  };

  public int getAge() {
    return this.age;
  };

  public float getSeniority() {
    return this.seniority;
  };

  @Override
  public String toString() {
      return "Employee{" +
              "\nage=" + age +
              "\n, name='" + name + '\'' +
              "\n, seniority=" + seniority +
              "\n, position='" + getPosition() + '\'' +
              "\n}";
  }
}