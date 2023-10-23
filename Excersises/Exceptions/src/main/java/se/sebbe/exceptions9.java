package se.sebbe;

import java.io.IOException;

public class exceptions9 {
    public static void main(String[] args) {
        try {
            int i = (int) ((Math.random()*10)+1);
            if (i >= 5) {
                checkedException();
            } else {
                unCheckedException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void checkedException() throws IOException {
        throw new IOException();
    }

    private static void unCheckedException() {
        throw new RuntimeException();
    }
}
