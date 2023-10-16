package se.sebbe;

public class arrays18 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 910, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.println(number + " är primtal");
            } else
                System.out.println(number + " är inte primtal");
        }
    }

    private static boolean isPrime(int value) {
        for (int i = 2; i <= value; i++) {
            if (value % i == 0)
                if (value == i && value % 2 != 0)
                    return true;
                else return false;
        }
        return true;
    }
}
