package se.sebbe;

public class methods11 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(uddaTalIArray(array));
    }
    private static int uddaTalIArray(int[] array){
        int j = 0;
        for (int i = 0; i<array.length;i++){
            if (array[i]%2!=0)
            j++;
        }
        return j;
    }
}
