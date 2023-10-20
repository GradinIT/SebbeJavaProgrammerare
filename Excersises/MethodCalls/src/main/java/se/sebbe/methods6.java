package se.sebbe;

public class methods6 {
    public static void main(String[] args) {
        int ett = 2;
        System.out.println(radiusToCircle(ett));
    }

    private static double radiusToCircle(int ett) {
        double pi = Math.PI;
        double scuareOfRadius = ett * 2;
        return pi * scuareOfRadius;
    }
}
