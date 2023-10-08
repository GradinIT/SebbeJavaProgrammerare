public class Strings11 {
    public static void main(String[] args) {
        //Skapa en metod som tar emot en sträng och räknar antalet ord i strängen.
        String one = "hey there edd boy, many doors yes?";
        System.out.println(words(one));
    }
    private static int words (String a){
        return a.split(" ").length;
    }
}
