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

    String myFirstJavaString = "Never gonna give you candy";
    System.out.println(
      "The length of my first Java String is "+myFirstJavaString.length()
    );
    System.out.printf(
      "The uppercase version of my first Java String is %s\n and the lowecase version is %s\n",
      myFirstJavaString.toUpperCase(),
      myFirstJavaString.toLowerCase()
    );
    System.out.println(
      "The index of the word 'candy' is "+
      myFirstJavaString.indexOf("candy")
    );
  }
}

