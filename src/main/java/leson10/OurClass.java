package leson10;

/**
 * Created by asv on 12.06.17.
 */
public class OurClass implements OurInterface {

    private int name;

    @Override
    public String doSmth() {
        return "Simple Class doing something !!!";
    }

    public int getName() {
        return name;
    }
}
