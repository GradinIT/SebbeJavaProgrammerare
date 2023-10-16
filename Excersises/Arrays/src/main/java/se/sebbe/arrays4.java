package se.sebbe;

public class arrays4 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int highest = 0;
        int lowest = 10;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>highest)
                highest = array[i];
            if (array[i]<lowest)
                lowest=array[i];
        }
        System.out.println("high: "+highest+"\nlow: "+lowest);
    }
}
