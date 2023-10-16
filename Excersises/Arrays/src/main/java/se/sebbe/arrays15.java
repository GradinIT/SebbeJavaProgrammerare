package se.sebbe;

import java.util.Arrays;

public class arrays15 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(array);
        int integer = array[4]+array[5];
        integer = integer /2;
        System.out.println(integer);
    }
}
