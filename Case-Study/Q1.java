
import java.util.Scanner;

class CARRENTAL{

    Scanner sc = new Scanner(System.in);

    void car(){
        System.out.println("Enter Your Km to drive car");
        int km = sc.nextInt();
        int car_rent = 800;
        int car_per_km = 20*km;
        int total_fair = car_rent + car_per_km;
        System.out.println(total_fair);

    }
    void van(){
        System.out.println("Enter your km to drive Van");
        int km = sc.nextInt();
        int van_rent = 1000;
        int van_per_km = 50 * km;
        int total_fair = van_per_km + van_rent;
        System.out.println(total_fair);
    }

    void bus(){
        System.out.println("Enter Your km to drive Bus");
        int km = sc.nextInt();
        int bus_rent = 1500;
        int bus_fair_km = 100 * km;
        int total_fair = bus_rent + bus_fair_km;
        System.out.println(total_fair);
    }
    
    
}

public class Q2{
    public static void main(String[] args) {
        CARRENTAL obj = new CARRENTAL();
        obj.car();
        obj.van();
        obj.bus();
    }
}
