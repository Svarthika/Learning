package practice.Task_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked_Exception {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("C:\\text.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File is not present");

        }
    }
}
