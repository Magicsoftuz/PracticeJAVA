public class Main {
    public static void main(String[] args) {
//        String[] cars = {"Matiz", "Nexia", "Chevrolate", "Tesla"};
//
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }

        String[] cars = new String[3]; // Oldindan nechta element borligini aytib quyish (Static joy ajratish)
        String[] phones = {}; // Dynamic joy ajaratish
        cars[0]= "Matiz";
        cars[1] = "Nexia";
        cars[2] = "Tesla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }


    }
}