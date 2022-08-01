public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Thin", "tommato", "eee", "peproni");
        Pizza pizza1 = new Pizza("thin", "tommato", "ee");
        Pizza pizza2 = new Pizza("thin", "tommato");
        Pizza pizza3 = new Pizza("thin");
        Pizza pizza4 = new Pizza();

        System.out.println(pizza.topping);
        System.out.println(pizza4.cheese);
    }
}