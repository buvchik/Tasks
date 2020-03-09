package jc01_2020.buvin.lesson13;

/*
 *
 * Сгенерировать текущую дату с учетом временной зоны. Вывести в консоль эту дату в исходном виде и для 10 случайных
 * предустановленных временных зон. Каждую с новой строки с указанием временной зоны
 *
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        System.out.println( ZonedDateTime.now());
        ArrayList<String> allZone = new ArrayList<>(ZoneId.getAvailableZoneIds());

        for (int i = 0; i < 10; i++) {
            System.out.println(ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of(allZone.get(new Random().nextInt(allZone.size())))));
        }

    }
}
