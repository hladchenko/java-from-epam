/*
    Ввести с консоли n целых чисел. На консоль вывести:
    Числа, которые делятся на 3 или на 9.
 */

package com.hladchenko.epam.chapter1.variant2;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = Util.readNumbers();
        int[] divisibleBy3 = Arrays.stream(numbers)
                .filter(number -> number % 3 == 0).toArray();
        int[] divisibleBy9 = Arrays.stream(numbers)
                .filter(number -> number % 9 == 0).toArray();
        System.out.println("Divisible by 3: " + Arrays.toString(divisibleBy3)
                + ". Divisible by 9: " + Arrays.toString(divisibleBy9));
    }
}
