package se.sebbe;

public class exceptions1 {
    public static void main(String[] args) {
       try {throwNullPointerException();
       }catch (Exception e){
         //  e.printStackTrace();
       }
    }
    public static void throwNullPointerException(){
        throw new NullPointerException();
    }
}