package jc01_2020.buvin.lesson09.task05;

/*
 *
 * Заполнить два списка целыми числами. Из первого списка удалить все отрицательные числа. Из второго - все положительные.
 * Создать третий список, состоящий из оставшихся элементов первых двух. Из третьего списка удалить все элементы со
 * значением 0. Вывести итоговый список в консоль. Максимально использовать готовые методы коллекций
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

    static List<Integer> fillList(List<Integer> list, int size) {
        Scanner scanner = new Scanner(System.in);
		System.out.println(size +" элементов :");
        for (int i = 0; i < size; i++) {//заполняем первый список
            int str = scanner.nextInt();
            list.add(str);
        }
        return list;
    }

    public static void main(String[] args) {
        // Объявить список
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1 = fillList(list1, 5);//заполняем первый список
        list2 = fillList(list2, 5);//заполняем второй список

		list1.removeIf(value -> value < 0);
        list2.removeIf(value -> value > 0);

        List<Integer> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);

        result.removeIf(value -> value==0);

		System.out.println(result);

    }

}
