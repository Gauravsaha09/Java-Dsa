// wap to read interger value from the file,sort them and prin in ascending order

import java.io.*;
import java.util.*;

class Q4{
    public static void main(String[] args) {
        String fileName;

        // Check if filename is given as command-line argument
        if (args.length == 1) {
            fileName = args[0];
        } else {
            // Otherwise, take filename from user input
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter file name: ");
            fileName = sc.nextLine();
        }

        List<Integer> numbersList = new ArrayList<>();

        // Read integers from the file
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] numbers = line.split("\\s+");
                for (String numStr : numbers) {
                    try {
                        int number = Integer.parseInt(numStr);
                        numbersList.add(number);
                    } catch (NumberFormatException e) {
                        // Ignore non-integer values
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
            return;
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Sort the list of integers
        Collections.sort(numbersList);

        // Print sorted integers
        System.out.println("Sorted integers in ascending order:");
        for (int number : numbersList) {
            System.out.println(number);
        }
    }
}