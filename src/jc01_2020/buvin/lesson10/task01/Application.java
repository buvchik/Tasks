package jc01_2020.buvin.lesson10.task01;

/*
 *
 * Заполнить произвольное множество строками. Вывести в консоль размер множества. Добавить строку, которая уже есть во
 * множестве. Убедиться, что размер не изменился
 *
 */

import java.util.*;

public class Application {

	public static void main(String[] args) {
		Set<String> list =new HashSet<>();
		Random r =new Random();
		int max = r.nextInt(10);
		for (int i = 0; i < max; i++) {
			list.add(" String = "+i);
		}
        System.out.print(" "+list);
        System.out.println();
		System.out.println(list.size());
		list.add(" String = "+1);
		System.out.println(list);
		System.out.println(list.size());
	}

}
