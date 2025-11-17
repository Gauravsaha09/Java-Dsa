// wap to find the longest word in the text file 

import java.io.*;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        String fileName;
        
        // If filename is not given in command line, take it from user
        if (args.length == 1) {
            fileName = args[0];
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter file name: ");
            fileName = sc.nextLine();
        }

        String longestWord = "";
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                // Split each line into words
                String[] words = line.split("\\s+");
                
                // Check each word's length
                for (String word : words) {
                    // Remove punctuation marks from word
                    word = word.replaceAll("[^a-zA-Z]", "");
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }

            if (!longestWord.isEmpty()) {
                System.out.println("Longest word: " + longestWord);
                System.out.println("Length: " + longestWord.length());
            } else {
                System.out.println("File is empty or contains no valid words.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
