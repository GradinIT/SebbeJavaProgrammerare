import java.util.Locale;

public class Strings16 {
    public static void main(String[] args) {
        //Skapa en metod som tar emot en sträng och returnerar en ny sträng där varje ord börjar med en versal.
        String ord = "ord av apor";
        System.out.println(startingBig(ord));
    }
    private static String startingBig (String a){
        StringBuilder builder = new StringBuilder();
            String[] array = a.split(" ");
        for (int b = 0;b < array.length;b++){
            builder.append(array[b].substring(0,1).toUpperCase());
            builder.append(array[b].substring(1));
            builder.append(" ");
        }
        return builder.toString();
    }
}
