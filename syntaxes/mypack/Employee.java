package mypack;

public abstract class Employee {
  private int age;
  private String name;
  private float seniority;

  public abstract String getPosition();

  public Employee(
      int age,
      String name,
      float seniority) {
    this.age = age;
    this.name = name;
    this.seniority = seniority;
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