/*Приветствовать любого пользователя при вводе его имени через командную строку.*/

package com.hladchenko.epam.chapter1.variant1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.format("Hello, %s", in.next());
    }
}
