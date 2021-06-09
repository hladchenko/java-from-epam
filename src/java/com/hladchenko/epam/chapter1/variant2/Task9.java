/*
    Ввести с консоли n целых чисел. На консоль вывести:
    «Счастливые» числа.
    счастливое число - это число, которое в конечном итоге достигает 1 при замене на сумму квадратов каждой цифры.
 */

package com.hladchenko.epam.chapter1.variant2;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] numbers = Util.readNumbers();
        Util.printNumbers(luckyNumbers(numbers));
    }

    private static int[] luckyNumbers(int[] numbers) {
        int[] luckyNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            char[] arrayOfDigits = String.valueOf(numbers[i]).toCharArray();
            int sum = 0;
            for (char digitChar : arrayOfDigits) {
                sum += Math.pow(Character.getNumericValue(digitChar), 2);
            }
            if (sum == 1) {
                luckyNumbers[i] = numbers[i];
            }
        }
        return Arrays.stream(luckyNumbers).filter(el -> el != 0).toArray();
    }
}
