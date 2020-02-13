package jc01_2020.buvin.lesson03;

/*
 *
 * Сформировать из введенного числа обратное по порядку входящих в него цифр и вывести на экран.
 * Например, если введено число 3486, то надо вывести число 6843.
 *
 * Формат вывода (ошибки недопустимы):
 * одно число с учетом знака
 *
 */

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		long input = scanner.nextLong();
		String str = String.valueOf(input);
		String result ="";
		int sizeChars=0;
		if (str.charAt(0)=='-') {
			result=result + "-";
			sizeChars=1;
		}
		for (int i = str.length()-1; i >=sizeChars ; i--) {
			result = result+str.charAt(i);
		}
		System.out.print(Integer.valueOf(result));
	}
}
