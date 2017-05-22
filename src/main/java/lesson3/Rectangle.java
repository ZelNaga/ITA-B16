package lesson3;

/**
 * Created by asv on 12.05.17.
 */
public class Rectangle implements Shape {

    public int sideA = 4;
    public int sideB = 7;

    @Override
    public int calculateSquare() {

        return sideA * sideB;
    }
}
