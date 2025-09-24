// print a given name in a function

import java.util.Scanner;

public class Q1 {
    public static void PrintMyName(String name) {
        System.out.println(name);
        return;
    }

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Your Text");
    String name = sc.next();
    PrintMyName(name);
}

}

