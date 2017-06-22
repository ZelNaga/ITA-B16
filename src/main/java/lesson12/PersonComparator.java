package lesson12;

import java.util.Comparator;

/**
 * Created by asv on 22.06.17.
 */
public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {


        return o1.getName().compareTo(o2.getName());
    }
}
