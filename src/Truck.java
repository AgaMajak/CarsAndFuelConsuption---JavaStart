public class Truck extends Car{
    int loadWeight;

    public Truck(String brand, int fuelCapacity, int fuelCompuption, boolean coinditionerOn, int loadWeight) {
        super(brand, fuelCapacity, fuelCompuption, coinditionerOn);
        this.loadWeight = loadWeight;
    }
}
