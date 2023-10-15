public class Strings17 {
    public static void main(String[] args) {
        //Skapa en metod som tar emot en sträng och kontrollerar om den är en giltig e-postadress.
        String email = "sebbe.syd@gmail.com";
        System.out.println(mailCheck(email));
    }

    private static boolean mailCheck(String mails) {
        if (!mails.contains("@") || !mails.contains(".")) {
            return false;
        } else {
            return true;
        }
    }
}
