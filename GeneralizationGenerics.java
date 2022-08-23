import java.util.ArrayList;
import java.util.List;

public class GeneralizationGenerics {
    public static void main(String[] args) {
        Transport bike = new Bike(), mountainBike;
        TransportWithFuel bus = new Bus(10), bus1 = new Bus(15), bus2 = new Bus(20),
                car = new Car(9), taxi1 = new Car(8), taxi2 = new Car(4);
        List<Transport> list = new ArrayList<>();

        Fuel petrol1=new Petrol(10);
        Fuel gas1=new Gas(10);

        System.out.println(bus1.getTank());
        bus1.
        System.out.println(bus1.getTank());
        /*

        list.add(bus1);
        list.add(taxi1);
        list.add(bike);

        for (Transport transport : list) {
            System.out.println();
            if (transport instanceof TransportWithFuel) {
                System.out.println(((TransportWithFuel) transport).getTank());
            }
            System.out.println(transport.getWheel());
        }
        */
         */

        /*
        car = new Car(10);
        bus = new Bus(10);
        bike = new Bike();
        System.out.println(car.getWheel());
        System.out.println(bike.getWheel());
        bus.drive();
        bike.drive();
        System.out.println(bus.getTank());
        bus.refueling();
        System.out.println(bus.getTank());

        for ()
         */
    }
}
