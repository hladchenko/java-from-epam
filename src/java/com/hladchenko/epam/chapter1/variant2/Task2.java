/*
    Ввести с консоли n целых чисел. На консоль вывести:
    Наибольшее и наименьшее число.
 */

package com.hladchenko.epam.chapter1.variant2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = Util.readNumbers();
        System.out.println(" Min: " + Arrays.stream(numbers).min().getAsInt());
        System.out.println(" Max: " + Arrays.stream(numbers).max().getAsInt());
    }
}
