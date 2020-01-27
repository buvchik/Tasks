package jc01_2020.buvin.lesson03;

/*
 *
 * Угадать случайное число
 * В программе генерируется случайное целое число от 0 до 100. Пользователь должен его отгадать не более чем за 10 попыток.
 * После каждой неудачной попытки должно сообщаться больше или меньше введенное пользователем число, чем то, что загадано.
 * Если за 10 попыток число не отгадано, то вывести загаданное число.
 *
 * Теста на это задание нет, поиграйтесь сами против компьютера
 *
 */

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int secret = (int) (Math.random() * 100 + 1);
		int enterNum=0,col = 0;
		while (secret!=enterNum && col <10 ){
			enterNum = scanner.nextByte();
			if (enterNum<0){ System.out.println("Число меньше 0");}
			else if (enterNum>secret){System.out.println("Ввели больше");}
			else if (enterNum<secret) {System.out.println("Ввели меньше");}
			else if (enterNum==secret) System.out.println("Угадали!");
			col++;
		}
		if (col >=10) System.out.println("Количество попыток превышено");
	}
}
