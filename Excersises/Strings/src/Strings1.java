import java.util.Scanner;

public class Strings1 {
    public static void main(String[] args) {
        String one = "hello";
        String two = " world";
        System.out.println(concatinate(one,two));
    }
    private static String concatinate(String a,String b){
        return a+b;
    }
}