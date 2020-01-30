package jc01_2020.buvin.lesson02;

/*
 *
 * Вводятся два целых числа. Проверить делится ли первое на второе.
 * Вывести на экран сообщение об этом, а также остаток (если он есть) и частное (в любом случае)
 *
 * Формат вывода (ошибки недопустимы):
 * "Делится. Частное = Х"
 * "Не делится. Частное = Х. Остаток = Y"
 * "Недопустимая операция"
 *
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long first = scanner.nextLong();
        long second = scanner.nextLong();
        if (second == 0) System.out.println("Недопустимая операция");
        else if (first % second == 0) {
            System.out.println("Делится. Частное = " + (int) first / second);
        } else {
            System.out.println("Не делится. Частное = " + (int) first / second + ". Остаток = " + first % second);

        }
    }
}
