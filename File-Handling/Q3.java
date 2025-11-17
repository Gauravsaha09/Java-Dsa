// wap to manage the two file content into third file, ensure all the words of the third file are sorted as per dictionary order.

import java.io.*;
import java.util.*;

class Q3 {
    public static void main(String[] args) {
        String file1, file2, destFile;

        // Check if filenames are given as command-line arguments
        if (args.length == 3) {
            file1 = args[0];
            file2 = args[1];
            destFile = args[2];
        } else {
            // Otherwise, take filenames from user input
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first source file name: ");
            file1 = sc.nextLine();
            System.out.print("Enter second source file name: ");
            file2 = sc.nextLine();
            System.out.print("Enter destination file name: ");
            destFile = sc.nextLine();
        }

        List<String> wordsList = new ArrayList<>();

        // Read words from first file
        readWordsFromFile(file1, wordsList);
        // Read words from second file
        readWordsFromFile(file2, wordsList);

        // Sort words in dictionary order
        Collections.sort(wordsList);

        // Write sorted words to destination file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(destFile))) {
            for (String word : wordsList) {
                bw.write(word);
                bw.newLine();
            }
            System.out.println("Files merged and sorted successfully into " + destFile);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void readWordsFromFile(String fileName, List<String> wordsList) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", "");
                    if (!word.isEmpty()) {
                        wordsList.add(word);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}