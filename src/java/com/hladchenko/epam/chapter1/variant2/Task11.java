/*
    Ввести с консоли n целых чисел. На консоль вывести:
    Элементы, которые равны полусумме соседних элементов
 */

package com.hladchenko.epam.chapter1.variant2;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[] numbers = Util.readNumbers();
        Util.printNumbers(halfSumNumbers(numbers));
    }

    private static int[] halfSumNumbers(int[] numbers) {
        int[] halfSumNumbers = new int[numbers.length];
        int found = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean isHalfNumberFromStart = (i == 0) && (numbers[i + 1] / 2 == numbers[i]);
            boolean isHalfNumberFromCenter = (i != 0) && (i != numbers.length -1) && ((numbers[i - 1] + numbers[i + 1]) / 2 == numbers[i]);
            boolean isHalfNumberFromEnd = (i == numbers.length - 1) && (numbers[i - 1] / 2 == numbers[i]);
            if (isHalfNumberFromStart || isHalfNumberFromCenter || isHalfNumberFromEnd) {
                halfSumNumbers[found] = numbers[i];
                found++;
            }
        }
        return Arrays.copyOf(halfSumNumbers, found);
    }
}
