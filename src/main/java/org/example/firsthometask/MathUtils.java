package org.example.firsthometask;

public final class MathUtils {

    private MathUtils() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must not be negative");
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(MathUtils.add(5, 19));
        System.out.println(MathUtils.factorial(12));
    }
}
