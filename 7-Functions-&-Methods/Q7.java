
import java.util.Scanner;

class Q7{
    public static void Calculate(int num1, int num2) { // parameters or formal parameters
        int sum = num1 + num2;
        System.out.println("Sum is : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Calculate(num1, num2);  // arguments or actual parameters 
    }
}