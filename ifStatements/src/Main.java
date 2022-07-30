public class Main {
    public static void main(String[] args) {
       int age = 40;

       if (age>75){
           System.out.println("You are Boomer!");
       }
       else if (age>40){
           System.out.println("You are pensioner");
       }
       else if (age>18){
           System.out.println("You are adult");
       }

       else {
           System.out.println("You are a baby");
       }
    }
}