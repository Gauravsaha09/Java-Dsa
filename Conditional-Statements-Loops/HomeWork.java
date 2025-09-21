// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.println("Enter Your First Number:");
        int num1 = sc.nextInt();

        System.out.println("Enter Your Second Number:");
        int num2 = sc.nextInt();

        // Menu for operation
        System.out.println("Choose Operation:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo)");

        int choice = sc.nextInt();
        int result = 0;   // to store result

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Addition = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Subtraction = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Multiplication = " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Modulo = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Choice! Please select between 1-5.");
        }

        sc.close();
    }
}
