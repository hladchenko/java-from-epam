/*
Ввести целые числа как аргументы командной строки, подсчитать их суммы и произведения. Вывести результат на консоль.
 */

package com.hladchenko.epam.chapter1.variant1;

public class Task5 {
    public static void main(String[] args) {
        int sum = 0, product = 1;
        int temp;
        for (String number : args) {
            temp = Integer.parseInt(number);
            sum += temp;
            product = product * temp;
        }
        System.out.println("Sum = " + sum + "; product = " + product);
    }
}
