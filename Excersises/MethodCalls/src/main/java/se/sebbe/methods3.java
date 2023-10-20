package se.sebbe;

public class methods3 {
    public static void main(String[] args) {
        String word = "pneumonoultramicroscopicsilicovolcanoconiosis";
        System.out.println(wordLength(word));
    }

    private static int wordLength(String word) {
        return word.length();
    }
}
