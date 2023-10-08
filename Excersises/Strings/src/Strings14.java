public class Strings14 {
    public static void main(String[] args) {
        //Skapa en metod som tar emot en sträng och ersätter alla förekomster av ett visst tecken med ett annat tecken.
        String one = "hello";
        char two ='l';
        char three = 'r';
        System.out.println(replaceChar(one,two,three));
    }
    private static String replaceChar (String a,char b,char c){
        String d ="";
        for( int i = 0; i < a.length() ; i++ ) {
            if (a.charAt(i)==b) {
                d += c;
            }else {
                d += a.charAt(i);
            }
        }
        return d;
    }
}
