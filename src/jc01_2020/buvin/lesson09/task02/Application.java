package jc01_2020.buvin.lesson09.task02;

/*
 *
 * Заполнить список строками. Каждую новую строку вставлять в начало списка. Вывести в консоль строку, с которой
 * начинается список
 *
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Объявить список
		List<String> list  = new LinkedList<>();
		for (int i = 0; i < 5; i++) {
			String str = scanner.nextLine();
			// Заполнить список
			list.add(0,str);
		}
		System.out.println("first = " + list.get(0));
	}

}
