package jc01_2020.buvin.lesson10.task02;

/*
 *
 * Заполнить множество случайными числами от 0 до 100. Удалить все числа, которые больше 50. Результат вывести в консоль.
 * Используйте Iterator
 *
 */

import java.util.*;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Integer,Integer> list =new HashMap<>();
		Random r =new Random();
		// Объявить список
		for (int i = 0; i < 20; i++) {
			// Заполнить список
			list.put(i,r.nextInt(100));
		}
		System.out.println(list);
		Iterator iterator = list.entrySet().iterator();
		while (iterator.hasNext()){
			Map.Entry<Integer,Integer> entry = (Map.Entry<Integer, Integer>) iterator.next();
			if (entry.getValue()>50)iterator.remove();
		}
		System.out.println(list);
	}

}
