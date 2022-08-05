public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] allObjects = {car, bicycle, boat};

        for (Vehicle veh : allObjects){
            veh.go();
        }

    }
}