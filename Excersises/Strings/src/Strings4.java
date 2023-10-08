public class Strings4 {
    public static void main(String[] args) {
        String one = "anna";
        char two = 'n';
        System.out.println(amount(one,two));
    }
    private static int amount (String a, char b){
        // stega igenom strängen a tecken för tecken
        int numberOfCharInString = 0;
        for( int i = 0; i < a.length() ; i++ ) {
            // om ett tecken är samma som tecken b
            if (a.charAt(i)==b) {
                // räkna upp en räknare med 1
                numberOfCharInString++;
            }
        }
        return numberOfCharInString;
    }
}
