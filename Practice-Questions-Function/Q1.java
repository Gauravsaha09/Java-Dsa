// Enter 3 Number from the user & make  a function to print their average

import java.util.Scanner;

public class Q1{
    public static int AverageThreeNum(int a , int b , int c) {
        int sum = (a + b + c);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = AverageThreeNum(a,b,c)/3;
        System.out.println(sum);
    }
}