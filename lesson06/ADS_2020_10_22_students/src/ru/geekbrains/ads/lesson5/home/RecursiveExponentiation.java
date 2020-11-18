package ru.geekbrains.ads.lesson5.home;

public class RecursiveExponentiation<E> {
    public static void main(String[] args) {
        System.out.println(recursionExponent(0, 2)); // 0
        try {
            recursionExponent(0, 0);
        } catch (IllegalArgumentException ie) {
            System.out.println("Попытка возведения нуля в нулевую степень"); // Exeption
        }
        System.out.println(recursionExponent(2, 0)); // 1
        System.out.println(recursionExponent(2,-2)); // 0,25 = после приведения к int = 0
        System.out.println(recursionExponent(2, 4)); //16
        System.out.println(recursionExponent(200, 200)); //0
        System.out.println(recursionExponentDouble(0, 2)); //0
        System.out.println(recursionExponentDouble(-2, -2));
        System.out.println(recursionExponentDouble(200, 200)); // Infinity

    }

    private static int recursionExponent( int number, int exponentiation ) {
        if (number == 0) {
            if (exponentiation > 0) {
                return 0;
            }
            else
                throw new IllegalArgumentException("Попытка возведения нуля в нулевую степень");
        }
        if (exponentiation == 0) return 1;

        if (exponentiation < 0) {
            return 1 / (number * recursionExponent(number, -exponentiation - 1));
        } else
            return number * recursionExponent(number, exponentiation - 1);
    }

    private static double recursionExponentDouble( double number, double exponentiation ) {
        if (number == 0) {
            if (exponentiation > 0) {
                return 0;
            }
            else
                throw new IllegalArgumentException("Попытка возведения нуля в нулевую степень");
        }
        if (exponentiation == 0) return 1;

        if (exponentiation < 0) {
            return 1 / (number * recursionExponentDouble(number, -exponentiation - 1));
        } else
            return number * recursionExponentDouble(number, exponentiation - 1);
    }

}
