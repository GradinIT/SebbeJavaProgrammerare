package se.sebbe;

public class methods8 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(minInArray(array));
    }
    private static int minInArray(int[] array){
        int j = 10;
        for (int i = 0; i<array.length;i++){
            if (j>array[i]){
                j=array[i];
            }
        }
        return j;
    }
}
