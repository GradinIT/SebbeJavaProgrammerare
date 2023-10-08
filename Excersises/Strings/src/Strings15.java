public class Strings15 {
    public static void main(String[] args) {
        String one = "hello there everynyan";
        System.out.println(replace(one,""));
    }
    private static String replace (String a,String b){
        return a.replace(" ",b);
    }
}
