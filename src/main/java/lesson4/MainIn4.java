package lesson4;

import lesson4.lowPackage.B;

/**
 * Created by asv on 15.05.17.
 */
public class MainIn4 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println(a.publicFieldInA);
        System.out.println(b.publicFieldInB);

        System.out.println(a.fieldInA);
        System.out.println(a.getProtectedField());

    }
}
