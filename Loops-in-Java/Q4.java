// print the table that tak input from the user

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        System.out.println("Enter the number that you want to print the table: ");
        
        int num = sc.nextInt();
           
        for (int i = 1; i<=10; i++) {
            System.err.println(num*i);
        }

       sc.close();

    }
}
