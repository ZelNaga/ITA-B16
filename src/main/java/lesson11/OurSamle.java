package lesson11;


import java.util.Objects;

/**
 * Created by asv on 19.06.17.
 */
public class OurSamle implements Comparable<OurSamle> {

    private int someField;

    private String name;



    @Override
    public int compareTo(OurSamle o) {

        if (this.getSomeField() < o.getSomeField()) {
            return -1;
        }

        if (this.getSomeField() > o.getSomeField()) {
            return 1;
        }
        return 0;
    }

    public int getSomeField() {
        return someField;
    }

    public void setSomeField(int someField) {
        this.someField = someField;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return someField == ((OurSamle) o).getSomeField();

    }

    /*@Override
    public int hashCode() {

        return someField;
    }*/

    @Override
    public String toString() {

        return Integer.toString(someField) + " " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
