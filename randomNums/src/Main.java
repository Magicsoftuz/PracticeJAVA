import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt();
        System.out.println("Random number int: "+x);

        int x10 = random.nextInt(10)+1;
        System.out.println("Random number only 1 to 10: "+x10);

        double y = random.nextDouble();
        System.out.println("Random number Double: "+y);

        boolean z = random.nextBoolean();
        System.out.println("Random number Boolean: "+z);
    }
}