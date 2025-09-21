// print the greeting if i press 1 then print "Hello" , if i press 2 print "Namaste" , if i press 3 then print "Bonjour" if i press another number then print "Invalid"


import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number");

        int button = sc.nextInt();
    
    //     if (button == 1) {
    //         System.out.println("Hello");
    //     }else if (button == 2){
    //         System.out.println("Namaste");
    //     }else if (button == 3){
    //         System.out.println("Bonjour");
    //     }else{
    //           System.out.println("Invalid Button");
    //     }
    // }

    switch(button){ 
        case 1 : System.out.println("Hello");
        break;
        case 2 : System.out.println("Namaste");
        break;
        case 3 : System.out.println("Bonjour");
        break;
        default: System.out.println("Invalid Button");
    }
    }
}
