public class Car extends Vehicle {
    boolean coinditionerOn;

    public Car(String brand, int fuelCapacity, int fuelCompuption, boolean coinditionerOn) {
        super(brand, fuelCapacity, fuelCompuption);
        this.coinditionerOn = coinditionerOn;
    }
}
