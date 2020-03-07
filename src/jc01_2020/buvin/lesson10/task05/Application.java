package jc01_2020.buvin.lesson10.task05;

/*
 *
 * Считать из консоли информацию вида "Покупатель товар количество", где Покупатель — имя покупателя (строка без пробелов),
 * товар — название товара (строка без пробелов), количество — количество приобретенных единиц товара. Сохранить эти
 * данные в карту. Имена покупателей и товаров уникальные. Для каждого покупателя вывести в консоль следующую информацию:
 * "Имя:
 * товар - общее купленное количество этого товара"
 *
 * Вся выходная информация должна быть отсортирована в алфавитном порядке
 *
 */

import java.util.*;

public class Application {
    static class Tovar {
        String name;
        int count;

        public Tovar(String name, int count) {
            this.name = name;
            this.count = count;
        }
    }

    public static void main(String[] args) {
        // Объявить список
        Map<String, List<Tovar>> map = new TreeMap<>();
        String[] name = {"Andry", "Oly", "Valera", "Kolya"};
        String[] tovar = {"Meat", "Chees", "Milk"};
        Random r = new Random();

        for (int i = 0; i < 40; i++) {
            // Заполнить список
            int nameNumber = r.nextInt(4);
            int nameTovar = r.nextInt(3);
            int countTovar = 1 + r.nextInt(10);
            if (!map.containsKey(name[nameNumber]))
                map.put(name[nameNumber], Arrays.asList(new Tovar(tovar[nameTovar], countTovar)));
            else {
                List<Tovar> arr = new ArrayList<>();
                arr.addAll(map.get(name[nameNumber]));
                boolean b = false;

                for (int j = 0; j < arr.size(); j++) {
                    if (arr.get(j).name.equals(tovar[nameTovar])) {
                        arr.get(j).count += countTovar;
                        b = true;
                        break;
                    }
                }
                if (!b) {
                    arr.add(new Tovar(tovar[r.nextInt(3)], countTovar));
                    map.put(name[nameNumber], arr);
                } else
                    map.replace(name[nameNumber], arr);
            }
        }


        for (Map.Entry<String, List<Tovar>> item : map.entrySet()) {

            System.out.println("Имя: " + item.getKey());
            List<Tovar> arr = new ArrayList<>();
            arr.addAll(map.get(item.getKey()));
            for (Tovar t : arr) {
                System.out.println(t.name + " - " + t.count);
            }
        }

//        System.out.println(map);

    }

}
