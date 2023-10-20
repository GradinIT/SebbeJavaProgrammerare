package se.sebbe;

public class methods4 {
    public static void main(String[] args) {
        String word = "pneumonoultramicroscopicsilicovolcanoconiosis";
        System.out.println(wordReverse(word));
    }

    private static String wordReverse(String word) {
        StringBuilder builder = new StringBuilder();
        builder.append(word).reverse();
        return builder.toString();
    }
}
