package package7;

/**
 * Created by asv on 02.06.17.
 */
public class Son extends Father {

    public String field = "Some Son field";

    static {

        System.out.println("Static in Son");
    }

    public Son() {
        System.out.println("Son constructed " + super.field + " "
        + this.field);
    }

    /*public void test(int i) {

        System.out.println("Primitive int");
    }*/

    public void test(Integer i) {

        System.out.println("Integer");
    }
}
