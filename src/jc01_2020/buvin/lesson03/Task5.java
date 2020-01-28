package jc01_2020.buvin.lesson03;

/*
 *
 * Найти все совершенные числа до 10000. Совершенное число - это такое число, которое равно сумме всех своих делителей,
 * кроме себя самого.
 * Например, число 6 является совершенным, т.к. кроме себя самого делится на числа 1, 2 и 3, которые в сумме дают 6.
 *
 * Формат вывода (ошибки недопустимы):
 * каждое число в новой строке
 *
 */

public class Task5 {
	public static void main(String[] args) {

		for (int i = 1; i <=10000; i++) {
			int sum=0;
			for (int j = 1; j <=i ; j++) {
				if (i%j==0 && i!=j) sum=sum+j;
			}
			if ( sum==i) System.out.println(i);

		}
	}
}
