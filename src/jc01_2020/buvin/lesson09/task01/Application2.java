package jc01_2020.buvin.lesson09.task01;

/*
 *
 * Заполнить список строками. Вывести в консоль самую длинную строку
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application2 {

    static <T> T findMax(List<T> array) {
        T t = array.get(0);
        for (T o : array) {
            if (t instanceof String) {
                if (t != o && o.toString().length() > t.toString().length())
                    t = o;
            } else if (t instanceof Integer) {
                if (t != o && (Integer) o > (Integer) t) t = o;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Объявить список
        List<String> list = new ArrayList<>();
            // List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
			// int str = scanner.nextInt();
            // Заполнить список
             list.add(str);
        }
        System.out.println(findMax(list));
    }

}
