package jc01_2020.buvin.lesson13;

/*
 *
 * Сгенерировать случайную дату в интервале с 1 по 4 марта 2020 (включительно).
 * Вывести в консоль каждую дату и
 * результат сравнения этих дат (дата1 больше/меньше/равна дата2)
 *
 */

import java.time.LocalDate;
import java.util.Random;

public class Task1 {
	public static void main(String[] args) {
        Random r = new Random();
        LocalDate date1 = LocalDate.of(2020,3,1+r.nextInt(4));
        LocalDate date2 = LocalDate.of(2020,3,1+r.nextInt(4));
        System.out.println(date1);
        System.out.println(date2);
	    if (date1.isBefore(date2)) System.out.println("date1 меньше date2");
	    else if (date1.isAfter(date2)) System.out.println("date1 больше date2");
	    else if (date1.isEqual(date2))System.out.println("date1 равна date2");

    }

}
