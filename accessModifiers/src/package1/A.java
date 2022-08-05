package package1;

import package2.*;
public class A {
    protected  String protectedMessage = "This is protected Message";
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);
      //  System.out.println(c.protectedMessage);
    }
}
