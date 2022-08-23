public abstract class TransportWithFuel<T extends Fuel> extends Transport {

    private Tank<T> tank;

    public TransportWithFuel() {
        super();
    }
}
