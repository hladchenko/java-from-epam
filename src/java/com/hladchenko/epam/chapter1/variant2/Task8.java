/*
    Ввести с консоли n целых чисел. На консоль вывести:
    Числа в порядке убывания частоты встречаемости чисел.
 */

package com.hladchenko.epam.chapter1.variant2;

import java.util.HashMap;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        int[] numbers = Util.readNumbers();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int number : numbers) {
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }
        System.out.println(map.entrySet().stream()
                .sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .collect(Collectors.toList()));
    }
}
