/*
    Ввести с консоли n целых чисел. На консоль вывести:
    Простые числа.
 */

package com.hladchenko.epam.chapter1.variant2;

import static com.hladchenko.epam.chapter1.variant2.Util.readNumbers;

public class Task6 {
    public static void main(String[] args) {
        int[] numbers = readNumbers();
        for (int number : numbers) {
            if (number == 1) continue;
            boolean simple = true;
            for (int i = 2; i <= number; i++) {
                if (number % i == 0 && number != i) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                System.out.println(number);
            }
        }
    }
}
