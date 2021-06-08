/*
    Ввести с консоли n целых чисел. На консоль вывести:
    Четные и нечетные числа
 */

package com.hladchenko.epam.chapter1.variant2;

public class Task1 {

    public static void main(String[] args) {
        int[] numbers = Util.readNumbers();
        printNumbers(numbers, true);
        printNumbers(numbers, false);
    }

    private static void printNumbers(int[] numbers, boolean even) {
        int multiple = even ? 0 : 1;
        System.out.print("\n" + (even ? "Четные" : "Нечетные") + " числа: ");
        for (int number : numbers) {
            if (number % 2 == multiple) {
                System.out.print(number + " ");
            }
        }
    }
}
