package jc01_2020.buvin.lesson09.task01;

/*
 *
 * Заполнить список строками. Вывести в консоль самую длинную строку
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Объявить список
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            // Заполнить список
            list.add(str);
        }
        String result = "";
        for (String str : list) {
            if (result.length() < str.length()) result = str;
        }
        System.out.print(result);
    }

}
