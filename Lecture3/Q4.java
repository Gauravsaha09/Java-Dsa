// if 3 is an odd number, print "Bazinga"

import java.util.Scanner;


public class Q4{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Bazinga");
        }
    }
}