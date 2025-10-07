import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.displayInfo();
        Vehicle car2 = new Vehicle("white");
        //  car = null// tearing the link and garbage collector will delete the obj

        System.out.println(car.getColor());
        System.out.println(car2.getColor());
        car.setColor("yellow");
        car.displayInfo();
        car2.displayInfo();
    }
}