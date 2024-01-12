package mypack;

import java.util.Arrays;
import java.util.Comparator;

public class LearnArray {
    public static void employeesMostSenority(
        Employee[] allEmployees
    ){
        CommonUtils.printSection("Array");
        Employee employeeMostSenior = Arrays
        .stream( allEmployees)
        .max(Comparator.comparing(Employee::getSeniority))
        .orElse(null);
      System.out.println("Employee with the most seniority is: "+employeeMostSenior);  
    }
}
