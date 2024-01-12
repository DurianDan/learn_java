package mypack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LearnArray {
    public static void employeesMostSenority(
        Employee[] allEmployees
    ){
        CommonUtils.printSection("Array: fixed sized");
        Employee employeeMostSenior = Arrays
        .stream( allEmployees)
        .max(Comparator.comparing(Employee::getSeniority))
        .orElse(null);
      System.out.println("Employee with the most seniority is: "+employeeMostSenior);  
    }

    public static void leanrArrayList(){
        CommonUtils.printSection("ArrayList: and array that can be expanded");
        ArrayList<String> boxingPunchs = new ArrayList<String>();
        boxingPunchs.add("Jab");
        boxingPunchs.add("Hook");
        boxingPunchs.add("Straight");
        boxingPunchs.add("Uppercut");
        System.out.printf(
            "There are %d punches %s\n",
            boxingPunchs.size(),
            boxingPunchs);
        System.out.println(
            "The most basic and important punch is a "
            + boxingPunchs.get(0));
        // remove(idx)
        // set(idx, item)
        // clear()
    }
}
