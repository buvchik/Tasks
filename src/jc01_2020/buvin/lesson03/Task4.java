package jc01_2020.buvin.lesson03;

/*
 *
 * Вычислить факториал введенного числа. n >= 0 (0! = 1)
 * n! = 1 * 2 * 3 * 4 * ... * n
 *
 * Формат вывода (ошибки недопустимы):
 * одно число
 */

import java.util.Scanner;

public class Task4 {
	public static int fact(int n){
			int rez =1;
			if (n==1||n==0)return rez;
			rez = n*fact(n-1);
            return rez;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeric = scanner.nextInt();
		if(numeric>0)
		System.out.println(fact(numeric));
	}
}
