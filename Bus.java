public class Bus extends TransportWithFuel {

    private final int wheel = 4;
    private Tank<Gas> tank;


    public int getWheel() {
        return wheel;
    }

    public int getTank(){
        return tank.getVolume();
    }

    public void refueling(Fuel fuel) {
        tank.setVolume(fuel.getQuantity());
    }
}
