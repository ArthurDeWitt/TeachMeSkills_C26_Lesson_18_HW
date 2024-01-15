package com.teachmeskills.lesson18.homework.hw0;

import java.util.*;
import java.util.stream.Collectors;
/*
Создать коллекцию класса ArrayList наполнить ее элементами рандомными элементами типа Integer.
С помощью Stream'ов:
	- Удалить дубликаты
	- Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
	- Каждый элемент умножить на 2
	- Отсортировать и вывести на экран первых 4 элемента
	- Вывести количество элементов в стриме
	- Вывести среднее арифметическое всех чисел в стриме

 */
public class Runner {
    public static void main(String[] args) {
        List<Integer> randomInt = new Random().ints(21, 0, 10)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(randomInt);
        System.out.println("Removing duplicates " + new ArrayList<>(new HashSet<>(randomInt)));
        System.out.println("Even numbers from 7th to 17th position " + randomInt.subList(6, 17)
                .stream().filter(n -> n % 2 == 0)
                .collect(Collectors.toList()));
        System.out.println("Multiplying each element " + randomInt
                .stream().map(n -> n * 2)
                .collect(Collectors.toList()));
        System.out.println("Sorting and outputting the first 4 elements " + randomInt
                .stream().sorted().limit(4)
                .collect(Collectors.toList()));
        System.out.println("Number of elements in stream " + randomInt.size());
        System.out.println("Average value " + randomInt.stream().mapToDouble(i -> i).average().orElse(0));
    }
}
