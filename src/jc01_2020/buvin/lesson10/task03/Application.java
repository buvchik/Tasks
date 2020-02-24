package jc01_2020.buvin.lesson10.task03;

/*
 *
 * Считать из консоли строку (в строке латинские буквы в разном регистре и пробелы). Вывести в консоль 5 первых уникальных
 * букв, отсортированных по алфавиту. Буквы в разных регистрах считаются одинаковыми. Решить задачу за наименьшее
 * количество действий
 *
 */

import java.util.*;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "sdfDfadcdxvsdfdfaF";//scanner.nextLine();
        Set<Character> set = new TreeSet<>();

        str = str.toLowerCase();
        for (int i = 0; i < str.length() - 1; i++) {
            set.add(str.toCharArray()[i]);
            if (set.size() == 5) break;
        }
        System.out.println(set);
    }

}
