package se.sebbe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class collections4 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        Set<Integer> hashSet = new HashSet<>();
        ints.forEach(i -> {
            System.out.println(i);
            hashSet.add(i);
        });
        System.out.println(hashSet);
    }
}
