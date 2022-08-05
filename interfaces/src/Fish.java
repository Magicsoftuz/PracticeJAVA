public class Fish implements Predator, Prey{
    @Override
    public void hunt() {
        System.out.println("Fish eat small fishes");
    }

    @Override
    public void flee() {
        System.out.println("The Shark eat fishes");

    }
}
