package se.sebbe;

public class arrays6 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0)
                summa+=array[i];
        }
        System.out.println(summa);
    }
}
