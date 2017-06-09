package lesson9;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by asv on 09.06.17.
 */
public class MainIn9 {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Vasia", 55);
        hashMap.put("Andriy", 155);
        hashMap.put("Vlad", 0);

        System.out.println(hashMap.get("Andriy"));

        HashSet<String> hashSet = new HashSet<>();

        System.out.println(hashSet.add("Masha"));
        System.out.println(hashSet.add("Masha"));
        System.out.println(hashSet.add("Masha"));



    }
}
