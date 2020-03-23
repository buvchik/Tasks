package jc01_2020.buvin.lesson13;

/*
 *
 * Создать приложение-напоминалку о количестве дней до дней рождения. Использовать карту. Ключ - имя человека,
 * значение - дата рождения (в прошлом, LocalDate). Реализовать метод по добавлению записи в карту (входные параметры имя и дата
 * строкой в формате "дд/мм/гггг"). Реализовать метод, который выведет в консоль имена и оставшиеся дни до
 * ближайшего дня рождения всех ("имя - осталось дней", каждое с новой строки). Отдельно реализовать метод, который
 * вернет кол-во дней для одного конкретного человека (входной параметр - имя)
 *
 */

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Formatter;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Task3 {
    static Map<String, LocalDate> map = new TreeMap<>();

    static void add(String name, String date) {
        String[] str = date.split("/");
        try {
            map.put(name, LocalDate.of(Integer.valueOf(str[2]), Integer.valueOf(str[1]), Integer.valueOf(str[0])));
        } catch (DateTimeException e) {
            System.out.println(String.format("Не корректные данные для %s", name));

        }
    }

    static Duration duration;

    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    static void print(Map.Entry<String, LocalDate> s) {

        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.getDefault());

        LocalDate newDate = LocalDate.of(s.getValue().getYear(), LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth());
        if (newDate.isBefore(s.getValue())) {
            duration = Duration.between(newDate.atStartOfDay(), s.getValue().atStartOfDay());
            System.out.println(formatter.format("%s - %d", s.getKey(), Math.abs(duration.toDays())));
        } else {
            duration = Duration.between(newDate.atStartOfDay(), s.getValue().atStartOfDay());
            if (isLeapYear(s.getValue().getYear()+1)) {
                System.out.println(formatter.format("%s - %d", s.getKey(), Math.abs(366-duration.toDays())));
            }else
            {
                System.out.println(formatter.format("%s - %d", s.getKey(), Math.abs(365-duration.toDays())));
            }

        }
    }

    static void allDR() {
        for (Map.Entry<String, LocalDate> s : map.entrySet()) {
            print(s);
        }
    }

    static void dR(String name) {
        for (Map.Entry<String, LocalDate> s : map.entrySet()) {
            if (name.equals(s.getKey())) {
                print(s);
            }
        }
    }

    public static void main(String[] args) {

        add("Anna", "24/03/2020");
        add("Andry", "14/08/1983");
        add("Vova", "01/12/2015");
        System.out.println(map);
        allDR();
        dR("Anna");
    }
}
