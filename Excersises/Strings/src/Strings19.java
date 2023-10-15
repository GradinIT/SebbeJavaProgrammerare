import java.util.Arrays;

public class Strings19 {
    public static void main(String[] args) {
        /*Skapa en metod som tar emot två strängar och kontrollerar om de är anagram
        (innehåller samma bokstäver i olika ordning).*/
        String ord1 = "anna";
        String ord2 = "anan";
        System.out.println(anagramCheck(ord1,ord2));
    }
    private static boolean anagramCheck (String a,String b){
        char[] charArray = a.toCharArray();
        char[] charArray2 = b.toCharArray();
        if (a.length()!=b.length()){
            return false;
        }
        Arrays.sort(charArray);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray,charArray2);
    }
}
