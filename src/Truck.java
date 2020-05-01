public class Truck extends Car {
    private int loadWeight;

    public Truck(String name, int fuelCapacity, double averageFuelComsuption, boolean coinditionerOn, int loadWeight) {
        super(name, fuelCapacity, averageFuelComsuption, coinditionerOn);
        this.loadWeight = loadWeight;
    }

    private double fuelUsage() {
        if (isCoinditionerOn()) {
            return getAverageFuelComsuption() + 1.6;
        } else
            return getAverageFuelComsuption();
    }

    private double fuelUsageWithCargo() {
        int tempCounter = loadWeight / 100;
        return tempCounter * 0.5;
    }

    private double fuelTotalUsage() {
        return fuelUsage() + fuelUsageWithCargo();
    }

    private double vehicleRange() {
        return getFuelCapacity() / fuelTotalUsage() * 100;
    }

    @Override
    void showInfo() {
        System.out.println(toString());
        System.out.printf("Zasięg pojazu wynosi: %.2f km\n\n", vehicleRange());
    }

    @Override
    public String toString() {
        return "Truck{" +
                "Nazwa: " + getName() +
                ", Pojemność baku: " + getFuelCapacity() +
                "l, średnie zużycie paliwa na 100km: " + fuelTotalUsage() +
                "l, waga ładunku: " + loadWeight +
                "kg, Czy klimatyzacja jest włączona?:" + isCoinditionerOn() +
                "}";
    }
}
