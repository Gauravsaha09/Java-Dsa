abstract class car {
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Playing");
    }
}

abstract  class BMW extends car {
    
    public void drive(){
        System.out.println("Driving..");
    }
}

class  Ufly extends BMW {
    
    public void fly(){
        System.out.println("Driving..");
    }
}



public class Q1{
    public static void main(String[] args) {
        car obj = new Ufly();
        obj.playMusic();
        obj.drive();
        obj.fly();
    }
    
}