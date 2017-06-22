package lesson11;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by asv on 19.06.17.
 */
public class MainIn11 {

    public static void main(String[] args) {
        OurSamle ourSamle1 = new OurSamle();
        ourSamle1.setSomeField(5);
        ourSamle1.setName("ddd");

        OurSamle ourSamle2 = new OurSamle();
        ourSamle2.setSomeField(1);
        ourSamle2.setName("zzzz");

        OurSamle ourSamle3 = new OurSamle();
        ourSamle3.setSomeField(0);
        ourSamle3.setName("aaa");


        OurSamle ourSamle4 = new OurSamle();
        ourSamle4.setSomeField(100);
        ourSamle4.setName("gggg");

        TreeSet<OurSamle> treeSetNaturalSorting = new TreeSet<>();

        treeSetNaturalSorting.add(ourSamle1);
        treeSetNaturalSorting.add(ourSamle2);
        treeSetNaturalSorting.add(ourSamle3);
        treeSetNaturalSorting.add(ourSamle4);




        treeSetNaturalSorting.forEach(System.out::println);

        TreeSet<OurSamle> treeSetWithComparator =
                new TreeSet<>(new OurComparatorImpl());

        treeSetWithComparator.add(ourSamle1);
        treeSetWithComparator.add(ourSamle2);
        treeSetWithComparator.add(ourSamle3);
        treeSetWithComparator.add(ourSamle4);
        System.out.println();

        treeSetWithComparator.forEach(System.out::println);



    }
}
