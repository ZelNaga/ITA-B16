package lesson3;

/**
 * Created by asv on 12.05.17.
 */
public class MainIn3 {

    public static void main(String[] args) {

        Circule c = new Circule();
        Rectangle r = new Rectangle();

        calculateShapeSquare(c);
        calculateShapeSquare(r);
    }


    public static void calculateShapeSquare(Shape s) {

        System.out.println(s.calculateSquare());
    }
}
