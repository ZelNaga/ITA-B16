package lesson12;

import java.util.TreeSet;

/**
 * Created by asv on 22.06.17.
 */
public class MainIn12 {

    public static void main(String[] args) {

        Person Vasia = new Person("Vasia");
        Vasia.setAge(23);

        Person Andriy = new Person("Andriy");
        Andriy.setAge(37);

        Person oldervert = new Person("oldervert");
        oldervert.setAge(32);

        TreeSet<Person> treeSetComparable = new TreeSet<>();
        treeSetComparable.add(Andriy);
        treeSetComparable.add(Vasia);
        treeSetComparable.add(oldervert);

        treeSetComparable.forEach(System.out::println);

        /*for (Person person : treeSetComparable) {

            System.out.println(person);
        }*/

        System.out.println();
        System.out.println();

        TreeSet<Person> treeSetComparator = new TreeSet<>(new PersonComparator());
        treeSetComparator.add(Vasia);
        treeSetComparator.add(oldervert);
        treeSetComparator.add(Andriy);

        treeSetComparator.forEach(System.out::println);


    }
}
