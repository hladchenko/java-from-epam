/*
Ввести пароль из командной строки и сравнить его со строкой-образцом.
 */

package com.hladchenko.epam.chapter1.variant1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.next().equals("password")) {
            System.out.println("Access Granted!");
        } else {
            System.out.println("Access Denied!");
        }
    }
}
