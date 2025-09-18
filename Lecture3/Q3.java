
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter Your First Number");
        int a = sc.nextInt();
        System.out.println("Enter Your Second Number");
        int b = sc.nextInt();
        if (a==b) {
            System.out.println("Equal");
        } else{
            if(a>b){
                System.out.println("Your First Number is Grater");
            }
            else{
                System.out.println("Your Second Number is Lesser");
            }
        }
    }
}
