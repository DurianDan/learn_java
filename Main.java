public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    float f1 = 35E3f;
    double d1 = 12e4d; // "E" and "e" are both "exponential", not case sensitive
    System.out.println(f1);
    System.out.println(d1);

    char charH = 'H';
    int charHIndexASCII = charH; // auto convert char into ASCII index of the character
   // this is "widening", type char is smaller than typr "int"
   short smallerNumber = (short) charHIndexASCII;
   // this is "narrowing", type "short" is smaller than type "int"
   // will eveluate at runtime
   // might throw error if value is bigger than converted type.
   System.out.println(smallerNumber);
  }
}

