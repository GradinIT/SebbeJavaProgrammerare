public class Strings6 {
    public static void main(String[] args) {
        //Skapa en metod som tar emot en sträng och returnerar en ny sträng med endast gemener.
        String one = "MONKAIEH";
        System.out.println(gemener(one));
    }
    private static String gemener(String a){
        return a.toLowerCase();
    }
}
