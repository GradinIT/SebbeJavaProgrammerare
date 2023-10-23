package se.sebbe;

public class exceptions4 {
    public static void main(String[] args) {
        try{
            System.out.println(25/0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
