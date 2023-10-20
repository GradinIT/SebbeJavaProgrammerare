package se.sebbe;

import java.util.Scanner;

public class flow4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lösenord = "lösenord";
        String input = "";
        do {
            System.out.println("ge ett lösenord");
            input = scanner.nextLine();
        }while (!input.equals(lösenord));
    }
}
