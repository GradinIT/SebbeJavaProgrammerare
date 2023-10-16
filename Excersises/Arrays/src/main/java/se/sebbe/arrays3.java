package se.sebbe;

import java.util.Arrays;

public class arrays3 {
    public static void main(String[] args) {
        String[] array = new String[]{"hello","there","mark","suckerberg","die","fight","live","grind"};
        Arrays.sort(array);
        System.out.printf("Sorted array: %s\n", Arrays.toString(array));
    }
}
