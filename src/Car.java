public class Car extends Vehicle {
    boolean coinditionerOn;

    public Car(String brand, int fuelCapacity, double averageFuelComsuption, boolean coinditionerOn) {
        super(brand, fuelCapacity, averageFuelComsuption);
        this.coinditionerOn = coinditionerOn;
    }

    double fuelUsage() {
        if (coinditionerOn) {
            return averageFuelComsuption + 0.8;
        } else
            return averageFuelComsuption;
    }

    double vehicleRange() {
        return fuelCapacity/fuelUsage()*100;
    }




}
