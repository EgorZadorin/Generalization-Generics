public class Tank<T extends Fuel> {
    private double price;
    private int volume;

    public int getVolume() {
        return volume;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
