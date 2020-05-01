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

    double fuelUsageWithCargo() {
        int tempCounter = loadWeight / 100;
        return tempCounter * 0.5;
    }

    double fuelTotalUsage() {
        return fuelUsage() + fuelUsageWithCargo();
    }

    @Override
    double vehicleRange() {
        return fuelCapacity / fuelTotalUsage() * 100;
    }

    @Override
    void showInfo() {
        super.showInfo();
    }

    @Override
    public String toString() {
        return "Truck{" +
                "Nazwa: " + name +
                ", Pojemność baku: " + fuelCapacity +
                "l, średnie zużycie paliwa na 100km: " + fuelTotalUsage() +
                "l, waga ładunku: " + loadWeight +
                "kg, Czy klimatyzacja jest włączona?:" + coinditionerOn +
                "}";
    }
}
