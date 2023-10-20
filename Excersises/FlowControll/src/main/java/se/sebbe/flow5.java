package se.sebbe;

import java.util.Scanner;

public class flow5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ge ett numer");
        int input = scan.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(input*i);
        }
    }
}
