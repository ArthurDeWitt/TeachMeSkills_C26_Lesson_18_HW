package com.teachmeskills.lesson18.homework.hw1;

import java.util.List;
import java.util.stream.Collectors;
/*
Задача 2
Создать коллекцию класса ArrayList со значениями имен всех студентов в группе
С помощью Stream'ов:
	- Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)
	- Отсортировать и вернуть первый элемент коллекции
 */
public class Launcher {
    public static void main(String[] args) {
        List<String> name = List.of("Dmitriy", "Polina", "Mark", "Daniil", "Lisa", "Stepan", "Arthur", "Ivan", "Andrey", "Sergey");

        String firstname = name
                .stream()
                .sorted()
                .findFirst()
                .orElse("");
        System.out.println(firstname);

        List<String> collect2 = name
                .stream()
                .filter(n -> n.toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(collect2);
    }
}

