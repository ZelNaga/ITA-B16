package lesson6;

/**
 * Created by asv on 29.05.17.
 */
public class Father extends GrandFather {

    static {
        System.out.println("Static block in Father !!!");
    }

    public Father() {
        System.out.println("Father constructed !!!");
    }
}
