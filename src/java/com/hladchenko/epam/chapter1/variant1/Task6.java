/*
Вывести фамилию разработчика, дату и время получения задания, а также
дату и время сдачи задания.
 */

package com.hladchenko.epam.chapter1.variant1;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Task6 {
    public static void main(String[] args) {
        String name = "Ruslan Hladchenko";
        LocalDateTime start = LocalDateTime.of(2021, Month.JUNE, 01, 20, 0);
        LocalDateTime end = LocalDateTime.of(2021, Month.JUNE, 3, 17, 22);
        System.out.format("Выполнил: %s; Получил: %s; Сдал: %s", name, start.format(
                DateTimeFormatter.ofPattern("d MMM uuuu HH:mm")), end.format(
                DateTimeFormatter.ofPattern("d MMM uuuu HH:mm")));
    }
}
