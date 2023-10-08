public class Strings7 {
    public static void main(String[] args) {
        //Skapa en metod som tar emot två strängar och jämför om de är lika.
        String one = "anna";
        String two = "anna";
        System.out.println(check(one,two));
    }
    private static boolean check (String a,String b){
        if (a.equals(b)){
            return true;
        }
            return false;
    }
}
