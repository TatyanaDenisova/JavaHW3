package org.example;

//Пусть дан произвольный список целых чисел.
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    static Random random = new Random();
    static List<Integer> array = new ArrayList<Integer>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(11));
        }
        System.out.println(array);
        int max = Collections.max(array);
        int min = Collections.min(array);
        double avg = array.stream().mapToInt(a->a).average().orElse(0);

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
            }
        }
        System.out.println("Список нечетных чисел " + array);
        System.out.println("max = "+max+ " min = "+min+ " average = "+ avg);

    }
}
