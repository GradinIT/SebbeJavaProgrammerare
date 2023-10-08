public class Strings13 {
    public static void main(String[] args) {
        //Skapa en metod som tar emot två strängar och kontrollerar om den första strängen innehåller den andra strängen.
        String one = "hello world";
        String two = "hello";
        System.out.println(contain(one,two));
    }
    private static boolean contain (String a, String b){
        return a.contains(b);
    }
}
