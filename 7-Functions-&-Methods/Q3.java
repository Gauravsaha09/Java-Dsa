// Make a function to Multiply two number and return the product

import java.util.Scanner;

public class Q3 {
    public static int MultiplyTwoNumber(int a , int b) {
        int sum = a * b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Num");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = MultiplyTwoNumber(a, b);
        
        System.out.println("Multiply is " + sum);
    }
}
