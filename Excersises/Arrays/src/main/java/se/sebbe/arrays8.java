package se.sebbe;

import java.util.Arrays;

public class arrays8 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array1 = new int[10];
        int counter = 9;
        for (int i = 0; i<array.length; i++){
            array1[counter] = array[i];
            counter--;
        }
        System.out.printf("Sorted array: %s\n", Arrays.toString(array));
        System.out.printf("Sorted array: %s\n", Arrays.toString(array1));
    }
}
