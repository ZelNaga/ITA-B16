package lesson2;

/**
 * Created by asv on 09.05.17.
 */
public class Rectangle implements Shape {
    private int sideA = 3;
    private int sideB = 7;

    public int calculateSquare() {
        return sideA * sideB;
    }

    public void setSideA(int sideA) {
        if (sideA <= 0) {
            System.out.println("Wrong arg A");
        } else {
            this.sideA = sideA;
        }
    }

    public void setSideB(int sideB) {

        if (sideB <= 0) {
            System.out.println("Wrong arg B");
        } else {
            this.sideB = sideB;
        }

    }
}
