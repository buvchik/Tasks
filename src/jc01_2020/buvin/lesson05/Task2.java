package jc01_2020.buvin.lesson05;

/*
 *
 * Вводится строка. Удалить из нее все пробелы. После этого определить, является ли она палиндромом (перевертышем),
 * т.е. одинаково пишется как с начала, так и с конца. Регистр букв не учитывать
 *
 *
 * Формат вывода:
 * "Да"
 * "Нет"
 *
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] strArr = str.trim().split(" ");// убираем пробелы по бокам и делим на слова " "
        String result = String.join("", strArr).toLowerCase(); //соединяем строки в одну
        String revers = new StringBuilder(result).reverse().toString().toLowerCase();
        if (result.equals(revers))
            System.out.println("Да");
        else System.out.println("Нет");

    }
}
