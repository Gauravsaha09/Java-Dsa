// wap to copy the content of  one file to another accept file name from user or as a command line argument in java

import java.io.*;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        String sourceFile, destFile;

        // Check if filenames are given as command-line arguments
        if (args.length == 2) {
            sourceFile = args[0];
            destFile = args[1];
        } else {
            // Otherwise, take filenames from user input
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter source file name: ");
            sourceFile = sc.nextLine();
            System.out.print("Enter destination file name: ");
            destFile = sc.nextLine();
        }

        try (
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destFile)
        ) {
            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i);
            }
            System.out.println("File copied successfully from " + sourceFile + " to " + destFile);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
