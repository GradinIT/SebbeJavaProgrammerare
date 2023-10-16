package se.sebbe;

public class arrays17 {
    public static void main(String[] args) {
        String[] array = new String[]{"hej", "sebastian", "sydbom"};
        String string = "";
        for (int i = 0; i < array.length; i++) {
            if (string.length() < array[i].length()) {
                string = array[i];
            }
        }
        System.out.println(string);
    }
}
