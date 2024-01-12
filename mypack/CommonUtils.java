package mypack;

public class CommonUtils {    
  public static void printSection(String sectionName) {
    // System.out use the buffer
    // not like Python, will flush the buffer every newline character
    // this object does not.
    // and sometimes will return intervened output in the console.
    // especially when the string is long, and formatting is complex
    System.out.printf("\n_____ Section : %s \n", sectionName);
  };
}
