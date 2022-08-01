public class Main {
    public static void main(String[] args) {
        Food food1 = new Food("Cola");
        Food food2 = new Food("Fanta");
        Food food3 = new Food("Soda");

//        Food[] ref = new Food[3];  // 1-usul
//        ref[0] = food1;
//        ref[1] = food2;
//        ref[2] = food3;

        Food[] ref ={food1,food2, food3};

        System.out.println(ref[2].name);
    }
}