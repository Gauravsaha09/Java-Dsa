
import java.util.Scanner;

class Q8{
    public static void main(String rgs[]){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while(i <= n){
            sum =+ i;
            i++;
        }
        
        System.out.println("Sum is: " + sum);
    }
}