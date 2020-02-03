package jc01_2020.buvin.lesson03;

/*
 *
 * С клавиатуры вводится натуральное число. Найти его наибольшую цифру
 *
 * Формат вывода (ошибки недопустимы):
 * одно число
 *
 */

import java.util.Scanner;


public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long input = scanner.nextLong();
		int max=0;
		String str = String.valueOf(input);
		for (int i = 0; i < str.length() ; i++) {
			if (str.chars().toArray()[i]>max){
				max = str.chars().toArray()[i];
			}
		}
		System.out.println((char)max);
	}
}
