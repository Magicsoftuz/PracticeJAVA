package package2;

import package1.*;

public class subA extends A {

    public static void main(String[] args) {
        C c = new C();

        System.out.println(c.publicMessage);

    }
}