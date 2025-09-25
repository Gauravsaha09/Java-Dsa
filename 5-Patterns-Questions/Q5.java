public class Q5 {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) {   // start at 4, go down to 1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
