// Make a function to Sebtract two number and return the product

import java.util.Scanner;


public class Q4 {
    public static int SubTwoNum(int a, int b) {
        int sub = a - b ;
        return sub;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           
         System.out.println("Enter Your Num");  
         int a = sc.nextInt();
         int b = sc.nextInt();

         int sub = SubTwoNum(a, b);
         System.out.println(sub);
    }
}
