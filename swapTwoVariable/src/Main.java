public class Main {
    public static void main(String[] args){
        String x = "water";
        String y = "Cola";
        String temp;

        temp = x;
        x = y;
        y=temp;
        System.out.println("X: "+x);
        System.out.println("Y: "+y);
    }
}
