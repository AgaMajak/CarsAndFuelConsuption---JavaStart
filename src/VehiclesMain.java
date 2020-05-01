public class VehiclesMain {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Toyota", 35, 4.3, false),
                new Car("Smart", 28, 4.0, false),
                new Truck("Volvo", 700, 36.6, false, 10000)
        };

        for (Car car : cars) {
            car.showInfo();
        }

        for (Car car : cars) {
            car.setCoinditionerOn(true);
            System.out.println("Włączono klimatyzację w: " + car.getName());
        }

        for (Car car : cars) {
            car.showInfo();
        }

    }
}
