public class Main {
    public static void main(String[] args) {
       Car car = new Car("Chevrolate", "Malibu", 2019);
//       Car car1 = new Car("Che", "<ma", 2002);
//       car1.copy(car); // birinchi usul

        Car car1 = new Car(car);

        System.out.println(car1.getModel());
    }
}