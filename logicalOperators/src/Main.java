import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int temp = 20;
//
//        if (temp>30){
//            System.out.println("It is hot outside");
//        }
//        else if (temp>=20 && temp<=30){
//            System.out.println("It is warm outside");
//        }
//        else {
//            System.out.println("It is cold outside");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game? Press quite a game q or Q button");

        String res = scanner.nextLine();
        System.out.println(res);
        if (res == "Q" || res =="q"){
            System.out.println("You are quite the game");
        }
        else {
            System.out.println("You are not quite the game");
        }


    }
}