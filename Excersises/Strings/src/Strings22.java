public class Strings22 {
    public static void main(String[] args) {
        /*Skapa en metod som tar emot en sträng och returnerar en ny sträng
         där varje tecken är bytt ut mot dess motsvarande ASCII-värde.*/
        String word = "hello";
        System.out.println(tooAscii(word));
    }

    private static String tooAscii(String word) {
        char[] array = word.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++){
            int a = array[i];
            builder.append(a);
            builder.append(" ");
        }
        return builder.toString();
    }
}
