public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "X", "2022");

        car.setYear("2024");
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println( car.getYear());

    }
}