package com.hladchenko.epam.chapter1.variant2;

import java.util.Arrays;
import java.util.Scanner;

public class Util {

    public static int[] readNumbers() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static void printNumbers(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}
