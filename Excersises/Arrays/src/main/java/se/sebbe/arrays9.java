package se.sebbe;

public class arrays9 {
    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 30, 40, 50, 46, 70, 48, 59,
                10, 110, 12, 130, 14, 150, 16, 170, 18, 190, 20, 210, 22, 230, 24, 250};
        int avarage = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 50){
                avarage += array[i];
                counter++;
            }
        }
        avarage = avarage / counter;
        System.out.println(avarage);
    }
}
