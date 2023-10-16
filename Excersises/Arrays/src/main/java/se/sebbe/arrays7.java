package se.sebbe;

public class arrays7 {
    public static void main(String[] args) {
        String[] array = new String[]{"hello","there","mark","suckerberg","die","fight"};
        String ord = "die";
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(ord)){
                System.out.println("the word is att: " + i + " in the array");
                System.exit(0);
            }
        }
        System.out.println("the word could not be found");
    }
}
