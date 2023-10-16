package se.sebbe;

import java.util.Arrays;

public class arrays14 {
    public static void main(String[] args) {
        String[] array = new String[]{"hello","there","mark","suckerberg","die","fight","live","grind"};
        for (String s:array){
            StringBuilder builder = new StringBuilder();
            builder.append(s);
            builder.reverse();
            System.out.println(builder);
        }


    }
}
