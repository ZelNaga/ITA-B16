package package7;

/**
 * Created by asv on 02.06.17.
 */
public class Father extends GrandFather {

    static {

        System.out.println("Static in Father");
    }

    public Father() {
        System.out.println("Father constructed");
    }
}
