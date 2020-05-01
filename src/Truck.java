public class Truck extends Car {
    int loadWeight;

    public Truck(String name, int fuelCapacity, double averageFuelComsuption, boolean coinditionerOn, int loadWeight) {
        super(name, fuelCapacity, averageFuelComsuption, coinditionerOn);
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
