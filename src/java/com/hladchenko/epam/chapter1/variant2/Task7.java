/*
    Ввести с консоли n целых чисел. На консоль вывести:
    Отсортированные числа в порядке возрастания и убывания.
 */

package com.hladchenko.epam.chapter1.variant2;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] numbers = Util.readNumbers();
        numbers = Arrays.stream(numbers).sorted().toArray();
        Util.printNumbers(numbers);
        int[] reversed = new int[numbers.length];
        int counter = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            reversed[counter] = numbers[i];
            counter++;
        }
        Util.printNumbers(reversed);
    }
}
