package se.sebbe;

public class methods5 {
    public static void main(String[] args) {
        int ett = 2;
        System.out.println(radiusToCircle(ett));
    }

    private static double radiusToCircle(int ett) {
        double pi = Math.PI;
        double radius = ett;
        return (2*pi) * radius;
    }
}
