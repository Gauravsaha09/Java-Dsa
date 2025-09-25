class Printer {
    private int number = 1;
    private final int max;

    public Printer(int max) {
        this.max = max;
    }

    public synchronized void printOdd() {
        while (number < max) {
            while (number % 2 == 0) {  // Wait if number is even
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Thread B (Odd): " + number);
            number++;
            notify();
        }
    }

    public synchronized void printEven() {
        while (number < max) {
            while (number % 2 != 0) {  // Wait if number is odd
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Thread A (Even): " + number);
            number++;
            notify();
        }
    }
}

public class EvenOddThreads {
    public static void main(String[] args) {
        Printer printer = new Printer(20);

        Thread threadA = new Thread(() -> {
            printer.printEven();
        });

        Thread threadB = new Thread(() -> {
            printer.printOdd();
        });

        threadA.start();
        threadB.start();
    }
}
