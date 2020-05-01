public class Truck extends Car {
    int loadWeight;

    public Truck(String brand, int fuelCapacity, double averageFuelComsuption, boolean coinditionerOn, int loadWeight) {
        super(brand, fuelCapacity, averageFuelComsuption, coinditionerOn);
        this.loadWeight = loadWeight;
    }

    @Override
    double fuelUsage() {
        if (coinditionerOn) {
            return averageFuelComsuption + 1.6;
        } else
            return averageFuelComsuption;
    }
}
