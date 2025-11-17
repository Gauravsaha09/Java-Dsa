
import java.util.Scanner;

// public class Q5{
//     void printMessage(){
//         System.out.println("Welcome to Java Programming!");
//     }


//     public static void main(String[] args) {
//         Q5 obj = new Q5();
//         obj.printMessage();
//     }
// }

// public class Q5{
//     void addNumbers(int a, int b){
//         int sum = a + b;
//         System.out.println("Sum: " + sum);
//     }
//    public static void main(String[]args){
//     Q5 obj = new Q5();
//     obj.addNumbers(5, 10);
//    }
// }


import java.util.Scanner;

public class Q5 {
    int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        Q5 obj = new Q5();
        int result = obj.square(number);
        System.out.println("Square: " + result);
    }
}
