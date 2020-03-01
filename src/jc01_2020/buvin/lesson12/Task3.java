package jc01_2020.buvin.lesson12;

/*
 *
 * Создать карту вида "фамилия"-"имя" из 20 элементов. Длина и фамилии, и имени от 5 до 10 символов
 * 1) Вывести в консоль все значения карты
 * 2) переписать все значения как имя + фамилия
 * 3) оставить в стриме все имена, которые не длиннее 16 символов
 * 4) Вывести в консоль самое длинное имя
 *
 */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Task3 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        // full the map
        for (int i = 0; i < 20; i++) {
            map.put("Фамилияыв" + i, "Имя" + i);
        }
        System.out.println(map);

        map.forEach((key, value) -> map.put(key, value + key));
        System.out.println(map);


		List<String> result = map.entrySet()
				.stream()
				.map(entry -> {if (entry.getValue().length()<16)
					return entry.getValue();
				else
					return "";
				})
				.collect(Collectors.toList());
		System.out.println(result);

		Collections.sort(result, (s1, s2) -> s2.length() - s1.length());
		String longName = result.get(0);
        System.out.println("longName = " + longName);

    }
}
