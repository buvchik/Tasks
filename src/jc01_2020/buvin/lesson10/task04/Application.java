package jc01_2020.buvin.lesson10.task04;

/*
 *
 * Заполнить карту записями вида "фамилия" - "имя". Вывести в консоль все пары значений. Удалить из карты все записи с
 * одинаковыми "именами" (если 2 и более человек имеют одинаковое имя, то удалить всех) и вывести в консоль оставшиеся записи.
 *
 */

import java.util.*;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> nameList = new HashMap<>();
//		for (int i = 0; i < 10; i++) {
//			String surname = scanner.nextLine();
//			String firstName = scanner.nextLine();
//		}
        nameList.put("Иванов", "Иван");
        nameList.put("Петров", "Петр");
        nameList.put("Сидоров", "Саша");
        nameList.put("Лохмачев", "Вася");
        nameList.put("Ложкин", "Саша");
        nameList.put("Вукша", "Маша");
        nameList.put("Пукалькина", "Лена");
        nameList.put("Пука", "Лена");

        System.out.println(nameList);

        Map<String, String> copyList = new HashMap<>(nameList);

        for (Map.Entry<String, String> i : nameList.entrySet()) {
            for (Map.Entry<String, String> j : nameList.entrySet()) {
                if (j.getValue().equals(i.getValue()) && !j.getKey().equals(i.getKey())) {
                    copyList.remove(j.getKey());
                }
            }
        }
        System.out.println(copyList);
    }

}
