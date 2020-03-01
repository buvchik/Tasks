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
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.toConcurrentMap;

public class Task3 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        // full the map

        map.put("Шашков", "Трофим");
        map.put("Бородай", "Зигмунд");
        map.put("Трофимов", "Афанасий");
        map.put("Власов", "Сергей");
        map.put("Павленко", "Григорий");
        map.put("Иваненко", "Устин");
        map.put("Иващенко", "Вячеслав");
        map.put("Ларионов", "Ждан");

       /* for (int i = 0; i < 20; i++) {
            if (i!=3)map.put("Фамили" + i, "Имя" + i);
			else map.put("Фамилияя" + i, "Имя" + i);
		}*/
        System.out.println("Первоначальный:");
        System.out.println(map);
        System.out.println("Поменяли Value:");
        map.forEach((key, value) -> map.put(key, value + key));
        System.out.println(map);

//Set
        /*
        Set<Map.Entry<String, String>> res = map.entrySet().stream()
                .filter(entry -> entry.getValue().length() < 16)
                .collect(Collectors.toSet());
        System.out.println(res);
        */
//List
        /*  List<String> result = map.entrySet()
                .stream()
                .map(entry -> {
                    if (entry.getValue().length() < 16)
                        return entry.getValue();
                    else
                        return "";
                })
                .collect(Collectors.toList());
        System.out.println(result);*/
//Map
        System.out.println("Убрали >16:");
        Map<String, String> result = map.entrySet().stream()
                .filter(e -> e.getValue().length() < 16)
                .collect(Collectors.toMap(
                        i -> String.valueOf(i.getKey()),
                        j -> j.getValue()
                ));

        System.out.println(result);
// сортировка
//        Collections.sort(result, (s1, s2) -> s2.length() - s1.length());
//        String longName = result.get(0);
//почему-то не работает
//        String longName = result.entrySet()
//                .stream()
//                .max((value1,value2)->value1.getValue().length()>value1.getValue().length()?1:-1)
//				.get().getValue();
        String longName = Collections.max(result.entrySet(), Comparator.comparingInt(entry -> entry.getValue().length())).getValue();

        System.out.println("longName = " + longName);

    }
}
