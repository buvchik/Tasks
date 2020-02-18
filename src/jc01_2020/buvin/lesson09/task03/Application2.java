package jc01_2020.buvin.lesson09.task03;

/*
 *
 * Заполнить список строками. 5 раз перенести последний элемент списка в начало. Вывести в консоль значения списка в
 * виде массива (["str1","str2","str3"...])
 *
 */

import java.util.*;

public class Application2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		// Объявить список
		for (int i = 0; i < 5; i++) {
			String str = scanner.nextLine();
			// Заполнить список
			list.add(str);
		}
		for (int i = 0; i < 5; i++) {
			list.add(0,list.get(list.size()-1));
			list.remove(list.size()-1);
		}
		System.out.println(Arrays.toString(new List[]{list}));
	}

}
