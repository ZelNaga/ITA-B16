package lesson11;

import leson10.OurClass;

import java.util.Comparator;

/**
 * Created by asv on 19.06.17.
 */
public class OurComparatorImpl implements Comparator<OurSamle> {

    @Override
    public int compare(OurSamle o1, OurSamle o2) {

        return o1.getName().compareTo(o2.getName());
    }
}
