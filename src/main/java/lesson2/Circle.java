package lesson2;

/**
 * Created by asv on 09.05.17.
 */
public class Circle implements Shape {
    public static String someStaticVariable = "SomeStaticVariable";

    int radius = 5;

    public Circle() {}

    public int calculateSquare() {

        return(int) 3.14 * (radius * radius);
    }
}
