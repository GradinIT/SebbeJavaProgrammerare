public class Strings5 {
    public static void main(String[] args) {
        //Skapa en metod som tar emot en sträng och returnerar en ny sträng med endast versaler.
        String one = "monkey";
        System.out.println(versal(one));
    }
    private static String versal (String a){
        return a.toUpperCase();
    }
}
