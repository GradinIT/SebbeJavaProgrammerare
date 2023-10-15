public class Strings23 {
    public static void main(String[] args) {
        //Skapa en metod som tar emot en sträng och returnerar en ny sträng där vokaler har ersatts med stjärnor.
        String word = "hello";
        System.out.println(vowlesTooStars(word));
    }

    private static String vowlesTooStars(String word) {
        String vowles = "aouåeiyäöAOUÅEIYÄÖ";
        char[] array1 = word.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char c : array1) {
            if (vowles.contains(String.valueOf(c))) {
                builder.append("*");
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
