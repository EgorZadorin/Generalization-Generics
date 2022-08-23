public class Car extends TransportWithFuel{

    private final int wheel = 4;

    Car(int tank) {
        super(tank);
    }

    public int getWheel() {
        return wheel;
    }

}
