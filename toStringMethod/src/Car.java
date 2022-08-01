public class Car {
    String name = "Tesla";
    String model = "X";
    int year = 2022;
    String color = "silver";
    double price = 88904.44;

    public String toString(){
        String myString = name+ "\n"+model +"\n"+year+"\n"+color+"\n"+price;
        return  myString;
    }
}
