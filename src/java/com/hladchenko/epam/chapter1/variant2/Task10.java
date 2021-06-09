/*
    Ввести с консоли n целых чисел. На консоль вывести:
    Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
 */

package com.hladchenko.epam.chapter1.variant2;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] numbers = Util.readNumbers();
        Util.printNumbers(palindromes(numbers));
    }

    private static int[] palindromes(int[] numbers) {
        int[] palindromes = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            char[] numberInCharArray = String.valueOf(numbers[i]).toCharArray();
            boolean isPalindrome = true;
            for (int j = 0; j < numberInCharArray.length / 2; j++) {
                if (numberInCharArray[j] != numberInCharArray[numberInCharArray.length - j - 1]) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                palindromes[i] = numbers[i];
            }
        }
        return Arrays.stream(palindromes).filter(el -> el != 0).toArray();
    }
}
