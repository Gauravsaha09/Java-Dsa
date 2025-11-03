
import java.util.Scanner;

class Q7{
    public static void main(String[]args){
       int counter = 1;
       System.out.print("Enter a number: ");
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       
       while(counter <= number){
        System.out.println(counter);
        counter++;
    
       }
    }
}


