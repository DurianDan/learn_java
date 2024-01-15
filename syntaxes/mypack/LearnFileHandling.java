package mypack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class LearnFileHandling {
    public static void createFile(String targetDestination){
        try {
            File myFile = new File(targetDestination);
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
              } else {
                System.out.println("File already exists.");
              }
        } catch (IOError|IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void writeFile(String filepath){
        try {
            FileWriter myFile = new FileWriter(filepath);
            myFile.write("Just keep swimming!");
            myFile.close();
        } catch (IOError|IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void readFile(String filepath){
        try {
            File myFile = new File(filepath);
            Scanner myFileReader = new Scanner(myFile);
            while (myFileReader.hasNextLine()) {
                System.out.println(
                    myFileReader.nextLine()
                );
            };
            myFileReader.close();
        } catch (IOError|IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
