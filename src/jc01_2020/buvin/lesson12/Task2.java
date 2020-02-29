package jc01_2020.buvin.lesson12;

/*
 *
 * Дополнить код одним методом Stream API так, чтобы в консоль было выведено число 0
 *
 */

import java.util.stream.IntStream;

public class Task2 {
	public static void main(String[] args) {
		int x = IntStream.range(-2, 2) // -2 -1 0 1
				// place code here
				.map(y->y*5)
				.reduce(10, Integer::sum);//10+
		System.out.println("x = " + x);
	}
}
