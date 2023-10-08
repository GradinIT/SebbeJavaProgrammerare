public class Strings10 {
    public static void main(String[] args) {
        //Skapa en metod som tar emot en sträng och kontrollerar om den är en palindrom (samma fram och baklänges).
        String one = "anna";
        System.out.println(palindrom(one));
    }
    private static boolean palindrom (String a){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a);
        String b = stringBuilder.reverse().toString();
        if (a.equals(b)){
            return true;
        }
        return false;
    }
}
