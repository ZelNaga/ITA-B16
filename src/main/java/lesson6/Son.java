package lesson6;

/**
 * Created by asv on 29.05.17.
 */
public class Son extends Father {

    static {
        System.out.println("Static block in Son !!!");
    }

    public Son() {
        System.out.println("Son constructed !!!");
    }
}
