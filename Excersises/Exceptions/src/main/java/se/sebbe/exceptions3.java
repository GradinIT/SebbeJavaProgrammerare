package se.sebbe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exceptions3 {
    public static void main(String[] args) {
        try{
            FileReader fileReader;
            BufferedReader bufferedReader = new BufferedReader(fileReader  = new FileReader("monkeyshit"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
