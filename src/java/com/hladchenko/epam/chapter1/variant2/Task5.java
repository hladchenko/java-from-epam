/*
    Ввести с консоли n целых чисел. На консоль вывести:
    Все трехзначные числа, в десятичной записи которых нет одинаковых
    цифр.
 */
package com.hladchenko.epam.chapter1.variant2;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] numbers = Util.readNumbers();
        int[] uniqueAndThreeDigit = Arrays.stream(numbers).filter(number -> number > 99 || number < -99).distinct().toArray();
        System.out.println("Unique and three-digit: " + Arrays.toString(uniqueAndThreeDigit));
    }
}
