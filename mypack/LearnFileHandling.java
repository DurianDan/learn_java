package mypack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

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
}
