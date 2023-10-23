package se.sebbe;

public class exceptions5 {
    public static void main(String[] args) {
        try{
            int[] i = new int[]{1,2};
            System.out.println(i[2]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
