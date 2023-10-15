package se.sebbe;

import java.util.*;


public class Vars1 {
    public static void main(String[] args) {
        int a = 10;
        double d = 3.14;
        String s = "JAVA ÄR KUL";
        int a1 = 9;
        int a2 = a + a1;
        final double d1 = 9.81;
        double d2 = d + d1;
        boolean b = true;
        char c = 'A';
        String s1 = "!";
        String s2 = s + s1;
        int a3 = 1;
        a3++;
        final String s3 = "Wigellkoncernen";
        System.out.println(s3);
        int a4 =0;
        Scanner scan = new Scanner(System.in);
        a4 = scan.nextInt();
        final int a5 = 100;
        int a6 = 2000 / a5;
        String s4 = String.valueOf(a6);
        boolean b1 = a2!=d2;
        Random r = new Random();
        char c1 = (char)(r.nextInt(26) + 'a');
        String s5 = s2 + "wow";
        int a7 = a4 -5;
        final double d3 = 3.0;
        double d4 = d2*d3;
        boolean b2 = !s.equals(s1);
        char c2 = (char) (c + 'b');
        String s6 = s.toLowerCase();
        int a8 = a7*2;
        final String s7 = "java";
        String s8 = s7 + " är kul";
        boolean b3 = !s.equals(s1) && !s.equals(s2);
        char c3 = Character.toLowerCase(c);
        String s9 = s3 +" "+c;
        int a9 = a8%3;
        final int a10 = 7;
        int a11 = 10 + a10;
        boolean b4 = b == b1;
    }
}