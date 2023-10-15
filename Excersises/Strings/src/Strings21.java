public class Strings21 {
    public static void main(String[] args) {
        //Skapa en metod som tar emot en sträng och returnerar den med första och sista bokstaven i varje ord bytta plats.
        String mening = "hello there friend";
        System.out.println(swapFirstAndLastInAllWords(mening));
    }
    private static String swapFirstAndLastInAllWords (String sentence){
        if (sentence.length()<2){
            return sentence;
        }
        String[] words = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(String word:words) {
            stringBuilder.append(swapFirstAndLast(word));
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    private static String swapFirstAndLast(String word) {
        char[] chars = word.toCharArray();
        char tempChar = chars[0];
        chars[0] = chars[chars.length-1];
        chars[chars.length-1] = tempChar;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i++){
            builder.append(chars[i]);
        }
        return builder.toString();
    }
}
