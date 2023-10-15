public class Strings18 {
    public static void main(String[] args) {
        //Skapa en metod som tar emot en sträng och returnerar en ny sträng där varje tecken är upprepat två gånger.
        String ord = "ole";
        System.out.println(repeat(ord));
    }

    private static String repeat(String a) {
        char[] charArray = a.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < charArray.length; i++){
            builder.append(charArray[i]);
            builder.append(charArray[i]);
        }
        return builder.toString();
    }
}
