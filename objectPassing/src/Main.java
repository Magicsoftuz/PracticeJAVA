public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla");
        Car car2 = new Car("BMW");

        Garage garage = new Garage();
        garage.park(car1);
        garage.park(car2);
    }
}