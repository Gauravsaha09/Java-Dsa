
import java.util.Scanner;

// Income Tax Calculator


// Income<5L
// 0% tax

// Income Between 5L and 10L
// 20% tax

// Income Above 10L
// 30% tax


public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");

        double income = sc.nextDouble();

        double tax;

        if (income <= 500000) {
            tax = 0;
        } else if (income <= 1000000) {
            tax = 0.20 * (income - 500000);
        } else {
            tax = 0.20 * 500000 + 0.30 * (income - 1000000);
        }
        System.out.println("Your income tax is: " + tax);

}           

}