public class Main {
    public static void main(String[] args) {
       Human human = new Human("Umid", 20, 72.2);
        Human human2 = new Human("Alex", 33, 80.5);
        System.out.println(human.name);
        System.out.println(human2.name);
        human2.drink();
        human.eat();
    }
}