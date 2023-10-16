package se.sebbe;

import java.util.Arrays;

public class arrays13 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int highest = 0;
        int lowest = 10;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > highest)
                highest = array[i];
            if (array[i] < lowest)
                lowest = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == highest) {
                array[i] = lowest;
                continue;
            }
            if (array[i] == lowest)
                array[i] = highest;
        }
        System.out.printf("Sorted array: %s\n", Arrays.toString(array));
    }
}
