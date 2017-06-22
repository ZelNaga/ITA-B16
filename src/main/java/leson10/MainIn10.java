package leson10;


/**
 * Created by asv on 12.06.17.
 */
public class MainIn10 {

    private String instanceField = "instanceField";
    private static String staticField = "staticField";


    public static void main(String[] args) {
        OurClass ourClass = new OurClass();

        System.out.println(ourClass.doSmth());

        System.out.println(new OurInterface() {

            @Override
            public String doSmth() {
                return "No Name Class doing something !!!";
            }
        }.doSmth());

        class LocalClass {

            String someMethod() {
                return "LocalClass do smth";
            }

        }

        LocalClass lc = new LocalClass();

        System.out.println(lc.someMethod());

        MainIn10 main = new MainIn10();

        MainIn10.NestedClass nestedClass = new MainIn10.NestedClass();


    }

    void innerDemo() {


        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.innerClassMethod());
    }

    void nestedDemo () {

        MainIn10.NestedClass nestedClass = new MainIn10.NestedClass();
        System.out.println(nestedClass.nestedClassMethod());

    }

    public class InnerClass {

        String innerClassMethod () {
            return "InnerClass doing smth " + instanceField;
        }
    }

    public static class NestedClass {

        String nestedClassMethod () {
            return "NestedClass doing smth " + staticField;
        }
    }
}
