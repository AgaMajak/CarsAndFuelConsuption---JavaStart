public class Vehicle {
    private String name;
    private int fuelCapacity;
    private double averageFuelComsuption;

    public Vehicle(String name, int fuelCapacity, double averageFuelComsuption) {
        this.name = name;
        this.fuelCapacity = fuelCapacity;
        this.averageFuelComsuption = averageFuelComsuption;
    }

    public String getName() {
        return name;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public double getAverageFuelComsuption() {
        return averageFuelComsuption;
    }

}

