import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>();

        foods.add("Sushi");
        foods.add("Osh");
        foods.add("KazanKavab");

        foods.set(0, "Chuchvara");
        foods.remove(2);
        foods.clear();



        for (int i = 0; i < foods.size(); i++) {
            System.out.println(foods.get(i));
        }
    }
}