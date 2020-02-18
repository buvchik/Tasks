package jc01_2020.buvin.lesson09.task04;

/*
 *
 * Заполнить список натуральными числами (целые положительные). Вывести в консоль среднее арифметическое всех четных
 * значений
 *
 * N.B. Ноль не является натуральным числом
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Объявить список
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Integer numeric = scanner.nextInt();
			// Заполнить список
			if (numeric%2==0 && numeric!=0) list.add(numeric);
		}
		int summ=0;
		for (int i=0;i<list.size();i++) {
			summ+=list.get(i);
		}
		System.out.println(summ/list.size());
	}

}
