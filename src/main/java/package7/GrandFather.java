package package7;

/**
 * Created by asv on 02.06.17.
 */
public class GrandFather {

    public String field = "Some GrandFather field";

    static {

        System.out.println("Static in GrandFather");
    }

    public GrandFather() {
        System.out.println("GrandFather constructed");
    }
}
