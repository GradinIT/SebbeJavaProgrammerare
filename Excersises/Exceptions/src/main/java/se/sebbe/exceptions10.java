package se.sebbe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class exceptions10 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(".exceptions10.txt",true));
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("say hi");
            String s = scan.nextLine();
            if (s.equals("hi")){
                bufferedWriter.append(s);
            }else {
                throw new IOException();
            }
        }catch (IOException e){
            System.out.println("you are not a good neighbor");
        }finally {
            System.out.println("check complete");
            bufferedWriter.close();
        }
    }
}
