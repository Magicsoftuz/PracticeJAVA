import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        double x = 3.14;
//        double y = -10;
//        double z;
//
//        // Maximum
//        z = Math.max(x, y);
//        System.out.println("Max: "+z);
//
//        //Minimum
//        z= Math.min(x, y);
//        System.out.println("Min "+ z);
//
//        // Abs
//        z = Math.abs(y);
//        System.out.println("Moduli "+z);
//
//        // Round (yaxlitlash)
//        z = Math.round(x);
//        System.out.println("nuqtadan keyingi songa qarab yaxlitlash (5<>" + z);
//
//        // Ceil (yaxlitlash)
//        z = Math.ceil(x);
//        System.out.println("Tepaga qarab yaxlitlash" + z);
//
//        // Floor
//        z= Math.floor(x);
//        System.out.println("Pastga qarab yaxlitlash" + z);
//
//

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X: ");
        x = scanner.nextInt();
        System.out.println("Enter Y: ");
        y = scanner.nextInt();

        z = Math.sqrt((x*x) + (y*y));
        System.out.println("Your heypenetousa: "+z);




    }
}