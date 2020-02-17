package jc01_2020.buvin.lesson05;

/*
 *
 * Вводится строка, содержащая буквы, целые неотрицательные числа и иные символы. Требуется все числа, которые
 * встречаются в строке, поместить в отдельный целочисленный массив. Например, если дана строка
 * "data 48 call 9 read13 blank0a", то в массиве должны оказаться числа 48, 9, 13 и 0. Каждый эдемент массива вывести
 * в консоль с новой строки
 *
 * Формат вывода:
 * число
 * число
 * число
 * ...
 *
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] strArr = str.trim().split("\\D"); //delete all simbols but numeric

        int[] result = new int[strArr.length];
        int count=0;
        for (int i = 0; i < strArr.length; i++) {
            String s = strArr[i].trim();
            if (!s.equals("")) {
				count++;
            	result[count] = Integer.valueOf(s);
                System.out.print(result[count]+" ");
            }
        }
        if (count==0) System.out.println("Цифр нет");

    }
}
