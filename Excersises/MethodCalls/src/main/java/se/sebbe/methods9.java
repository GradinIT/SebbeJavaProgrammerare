package se.sebbe;

public class methods9 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(sumOfArray(array));
    }
    private static int sumOfArray(int[] array){
        int j = 0;
        for (int i = 0; i<array.length;i++){
            j+=array[i];
        }
        return j;
    }
}
