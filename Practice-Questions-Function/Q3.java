
import java.util.Scanner;



public class Q3{
    public static int  GraterNum(int a , int b) {
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();

          int greater = GraterNum(num1, num2);
          System.out.println("Greater num is: "+ greater);


        

    }
}
  

