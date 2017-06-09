package package7;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by asv on 02.06.17.
 */

public class FluentImpl {

    public static int staticField = 0;

    FluentImpl doSmth1() {

        System.out.println("doSmth1 " + staticField);
        return this;
    }

    FluentImpl doSmth2() {

        System.out.println("doSmth2 " + staticField);
        return this;
    }


}
