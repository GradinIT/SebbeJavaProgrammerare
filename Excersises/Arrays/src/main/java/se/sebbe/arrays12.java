package se.sebbe;

import java.util.Arrays;

public class arrays12 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3,4,5};
        int[] array2 = new int[]{6,7,8,9,10};
        int[] array3 = new int[10];
        for (int i = 0; i <array1.length; i++){
            array3[i]= array1[i];
            array3[i+5]= array2[i];
        }
        System.out.printf("Sorted array: %s\n", Arrays.toString(array3));
    }
}
