public class VehiclesMain {
    public static void main(String[] args) {
//        Car car1 = new Car("Toyota", 35, 4.3, false);
//        car1.showInfo();
//
//        car1.coinditionerOn = true;
//        car1.showInfo();

        Truck truck = new Truck("Volvo",700,36.6,false,2000);
        truck.showInfo();
        truck.setCoinditionerOn(true);
        truck.showInfo();

    }
}
