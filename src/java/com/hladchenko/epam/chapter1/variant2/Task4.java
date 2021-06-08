/*
    Ввести с консоли n целых чисел. На консоль вывести:
    Числа, которые делятся на 5 и на 7.
 */

package com.hladchenko.epam.chapter1.variant2;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = Util.readNumbers();
        int[] divisibleBy5And7 = Arrays.stream(numbers)
                .filter(number -> number % 5 == 0 && number % 7 == 0).toArray();
        System.out.println("Divisible by 5 and 7: " + Arrays.toString(divisibleBy5And7));
    }
}
