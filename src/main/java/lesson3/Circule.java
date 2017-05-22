package lesson3;

/**
 * Created by asv on 12.05.17.
 */
public class Circule implements Shape {

    int radius = 3;

    @Override
    public int calculateSquare() {
        return(int) 3.14 * (radius * radius);
    }
}
