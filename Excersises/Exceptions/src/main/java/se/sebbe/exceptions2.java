package se.sebbe;

import java.util.Scanner;

public class exceptions2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        int i = 0;
        try{
            System.out.println("ge mig ett numer");
            s = scanner.nextLine();
            i = Integer.parseInt(s);
            System.out.println("numret du gav var " + i);
        }catch (NumberFormatException e){
            System.out.println("inte ett numer");
        }
    }
}
