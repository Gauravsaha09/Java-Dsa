
import java.util.function.Function;

// public class Q2{
//     public static void main(String[] args) {
//         int [] a = new int [3];

//         a  [0] = 10;
//         a  [1] = 10;
//         a  [2] = 10;

//         System.out.println(a[0]);
//         System.out.println(a[1]);
//         System.out.println(a[2]);
//     }
// }


class Q2{

    // function 1

   static  void ar(){
        int [] a = new int [3];

        a  [0] = 10;
        a  [1] = 10;
        a  [2] = 10;

        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }
    }

// function  2
void ab(){
    int [] sum = {1,2,3,4,5,6,7,8,9};

    int store = 0;
    for (int i = 0; i < sum.length; i++) {
        store = sum[i] + store;

        System.out.println(sum[i]);
    }
}


    public static void main(String[] args) {
        // Q2 oj = new Q2();
        // oj.ar();
        // oj.ab();

         ar();
    }
}
