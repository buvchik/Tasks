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
		String str = String.valueOf(input);
		int array[]=str.chars().toArray();
		int max=0;
		for (int i = 0; i < str.length() ; i++) {
			if (array[i]>max){
				max = array[i];
			}
		}
		System.out.println((char)max);
	}
}
