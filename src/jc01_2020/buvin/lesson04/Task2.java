package jc01_2020.buvin.lesson04;

/*
 *
 * Найти в массиве те элементы, значение которых больше среднего арифметического, взятого от всех элементов массива.
 *
 * Пример: {1, 2, 8, 4, 16, 10, 6}. Среднее: 6,71.
 * Вывод:
 * 8
 * 16
 * 10
 *
 * Формат вывода:
 * каждое число с новой строки. Сохранить порядок следования чисел в массиве
 *
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        double sred = 0;
        for (int i : array) {
            sred += i;
        }
        sred = sred / (array.length);
        for (int i : array) {
            if (i > sred) System.out.println(i);
        }
    }
}
