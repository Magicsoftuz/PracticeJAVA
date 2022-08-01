public class Main {
    public static void main(String[] args) {
       Car car1 = new Car();
       Car car2 = new Car();

        System.out.println(car1.name);
        car1.brake();

        System.out.println(car2.price);
        car2.drive();
    }
}