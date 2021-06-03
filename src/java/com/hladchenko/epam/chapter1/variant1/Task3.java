/*
Вывести заданное количество случайных чисел с переходом и без перехода
на новую строку.
 */

package com.hladchenko.epam.chapter1.variant1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int randomInt = (int) Math.floor(Math.random() * 10);
            System.out.print(randomInt + ((randomInt % 2 == 0) ? "" : "\n"));
        }
    }
}
