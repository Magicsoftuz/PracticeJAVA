import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> market = new ArrayList<>();

        ArrayList<String> foods = new ArrayList<>();
        foods.add("Banana");
        foods.add("Garlic");
        foods.add("Tomato");

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Cola");
        drinks.add("Fanta");
        drinks.add("Soda");

        market.add(foods);
        market.add(drinks);

        System.out.println(market.get(1).get(0));


    }
}