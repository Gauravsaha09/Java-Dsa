
import java.util.Scanner;

public class Q1{

      void com() {
            Scanner sc = new Scanner(System.in);
             System.out.println("Enter your First name");
             String a = sc.nextLine();
             System.out.println("Enter your Second name");
             String b = sc.nextLine();

             String c = a + " " + b ;

            System.out.println(c);
      }

     public static void main(String[] args) {
         Q1 oj = new Q1();
         oj.com();
     }
}