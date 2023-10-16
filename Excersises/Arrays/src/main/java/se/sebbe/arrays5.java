package se.sebbe;

public class arrays5 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int highest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2!=0)
                highest++;
        }
        System.out.println(highest);
    }
}
