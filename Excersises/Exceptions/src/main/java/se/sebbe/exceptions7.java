package se.sebbe;

import java.io.IOException;
import java.util.Scanner;

public class exceptions7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        int i;
        try{
            System.out.println("give a number");
            s = scanner.nextLine();
            i = Integer.parseInt(s);
            if (i==1){
                throw new IOException();
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
