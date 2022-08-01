public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        System.out.println(car.speed);
        System.out.println(bicycle.speed);

        car.start();
        bicycle.stop();
        System.out.println(car.doors);
        System.out.println(bicycle.pedals);
    }
}