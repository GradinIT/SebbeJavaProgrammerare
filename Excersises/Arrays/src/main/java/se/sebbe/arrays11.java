package se.sebbe;

public class arrays11 {
    public static void main(String[] args) {
        int[] array = new int[]{1, -2, 3, -4, 5, -6, 7};
        int product = 1;
        for (int i = 0; i < array.length; i++){
            if (array[i]>0)
                product*=array[i];
        }
        System.out.println(product);
    }
}
