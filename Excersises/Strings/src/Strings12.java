public class Strings12 {
    public static void main(String[] args) {
        //Skapa en metod som tar emot en sträng och returnerar den med orden i omvänd ordning.
        String one = "hey there edd boy, many doors yes?";
        System.out.println(printRevers(one));
    }

    private static String printRevers(String sentence) {
        String words[] = sentence.split(" ");
        StringBuilder builder = new StringBuilder();
        for(int i = words.length-1; i >= 0; i--) {
            builder.append(words[i]);
            builder.append(" ");
        }
        return builder.toString();
    }
}
