public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    float f1 = 35E3f;
    double d1 = 12e4d; // "E" and "e" are both "exponential", not case sensitive
    System.out.println(f1);
    System.out.println(d1);

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

    // String manipulation
    String myFirstJavaString = "Never gonna give you up";
    System.out.println(
      "The length of my first Java String is "+myFirstJavaString.length()
    );
    System.out.printf(
      "The uppercase version of my first Java String is %s\n and the lowecase version is %s\n",
      myFirstJavaString.toUpperCase(),
      myFirstJavaString.toLowerCase()
    );
    System.out.println(
      "The index of the word 'up' is "+
      myFirstJavaString.indexOf("up")
    );

    // Math
    System.out.println(
      "The quare root of 4.7 is "
      + Math.sqrt(4.7f) // default return is double
    );

    // if else
    if (myFirstJavaString == "Never gonna give you up"){
      System.out.println("Never gonna let you down");
    }else{
      System.out.println("*Wrong song!");
    };

    // switch statement (match)
    // Using a single expression in the switch
    // brilliant suggestion by ChatGPT
    int myAge = 23;
    boolean amIGrinding = true;
    switch (myAge * 10 + (amIGrinding ? 1 : 0)) {
        case 231:
            System.out.println("I will champion one day");
            break;
        case 240:
            System.out.println("Get your ass up, you are not done yet!");
            break;
        default:
            System.out.println("Chill Bro!");
    };
  }
}

