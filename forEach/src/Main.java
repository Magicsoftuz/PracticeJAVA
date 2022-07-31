import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Array
        String[] animals = {"bird", "cat", "dog", "rat"};
        for (String animal: animals) {
            System.out.println(animal);
        }

        // ArrayList

        ArrayList<String> anims = new ArrayList<>();
        anims.add("bird");
        anims.add("cat");
        anims.add("dog");

        for(String anim: anims){
            System.out.println(anim);
        }
    }
}