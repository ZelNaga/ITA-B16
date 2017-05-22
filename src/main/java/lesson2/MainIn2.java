package lesson2;

/**
 * Created by asv on 09.05.17.
 */

public class MainIn2 {

    public static void main(String[] args) {

        B b = new B();

        b.showProtectedField();


        /*Circle circle = new Circle();
        System.out.println(Circle.someStaticVariable);

        Rectangle rectangle = new Rectangle();

        rectangle.setSideA(1);*/


        //calculateShapeSquare(circle);
        //calculateShapeSquare(rectangle);
    }

    public static void calculateShapeSquare(Shape s) {

        System.out.println(s.calculateSquare());
    }
}
