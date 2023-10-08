public class Strings8 {
    public static void main(String[] args) {
        //Skapa en metod som tar emot en sträng och returnerar sama sträng som små bokstäver.
        //
        String one = "MONKAIEH";
        System.out.println(gemener(one));
    }
    private static String gemener(String a){
        return a.toLowerCase();
    }
}
