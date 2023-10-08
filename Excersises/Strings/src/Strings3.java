public class Strings3 {
    public static void main(String[] args) {
        String one = "anne";
        System.out.println(reverse(one));
        System.out.println(reverseTwo(one));
    }
    private static String reverse (String a){
        String b = "";
        for (int i = a.length()-1;i >= 0;i--) {
            b += a.charAt(i);
        }
        return b;
    }
    private static String reverseTwo (String a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a);
        return stringBuilder.reverse().toString();
    }
}
