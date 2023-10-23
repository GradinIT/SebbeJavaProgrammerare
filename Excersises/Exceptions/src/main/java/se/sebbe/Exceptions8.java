package se.sebbe;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions8 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("say hi");
            String s = scan.nextLine();
            if (s.equals("hi")){
                System.out.println("good");
            }else {
                throw new IOException();
            }
        }catch (IOException e){
            System.out.println("you are not a good neighbor");
        }finally {
            System.out.println("check complete");
        }
    }
}
