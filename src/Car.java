public class Car extends Vehicle {
    boolean coinditionerOn;

    public Car(String name, int fuelCapacity, double averageFuelComsuption, boolean coinditionerOn) {
        super(name, fuelCapacity, averageFuelComsuption);
        this.coinditionerOn = coinditionerOn;
    }

    double fuelUsage() {
        if (coinditionerOn) {
            return averageFuelComsuption + 0.8;
        } else
            return averageFuelComsuption;
    }

    double vehicleRange() {
        return fuelCapacity / fuelUsage() * 100;
    }

    void showInfo() {
        System.out.println(toString());
        System.out.printf("Zasięg pojazu wynosi: %.2f km\n", vehicleRange());
    }


    @Override
    public String toString() {
        return "Car{" +
                "Czy klimatyzacja jest włączona?:" + coinditionerOn +
                ", Nazwa: " + name + '\'' +
                ", Pojemność baku: " + fuelCapacity +
                ", średnie zużycie paliwa na 100km: " + fuelUsage() +
                "l}\n";
    }
}
