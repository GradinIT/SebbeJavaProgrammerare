public class Strings9 {
    public static void main(String[] args) {
        //Skapa en metod som tar emot en sträng och returnerar sama sträng som stora bokstäver.

        String one = "monkey";
        System.out.println(versal(one));
    }
    private static String versal (String a){
        return a.toUpperCase();
    }
}
