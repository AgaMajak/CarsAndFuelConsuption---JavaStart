public class Car extends Vehicle {
    private boolean coinditionerOn;

    public Car(String name, int fuelCapacity, double averageFuelComsuption, boolean coinditionerOn) {
        super(name, fuelCapacity, averageFuelComsuption);
        this.coinditionerOn = coinditionerOn;
    }

    public boolean isCoinditionerOn() {
        return coinditionerOn;
    }

    public void setCoinditionerOn(boolean coinditionerOn) {
        this.coinditionerOn = coinditionerOn;
    }

    double fuelUsage() {
        if (coinditionerOn) {
            return getAverageFuelComsuption() + 0.8;
        } else
            return getAverageFuelComsuption();
    }

    double vehicleRange() {
        return getFuelCapacity() / fuelUsage() * 100;
    }


    void showInfo() {
        System.out.println(toString());
        System.out.printf("Zasięg pojazu wynosi: %.2f km\n", vehicleRange());
    }

    @Override
    public String toString() {
        return "Car{" +
                "Nazwa: " + getName() +
                ", Pojemność baku: " + getFuelCapacity() +
                "l, średnie zużycie paliwa na 100km: " + fuelUsage() +
                "l, Czy klimatyzacja jest włączona?:" + coinditionerOn +
                "}";
    }
}
