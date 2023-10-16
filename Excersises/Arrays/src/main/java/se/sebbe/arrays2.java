package se.sebbe;

public class arrays2 {
    public static void main(String[] args) {
        double[] array = new double[]{1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 11};
        double avarage = 0;
        for (int i = 0; i < array.length; i++){
            avarage += array[i];
        }
        avarage = avarage / array.length;
        System.out.println(avarage);
    }
}
