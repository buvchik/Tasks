package jc01_2020.buvin.test01;

/*
 *
 * Считать из консоли строку, состоящую из цифр.
 * Вычислить firstSum как сумму каждого четвертого элемента. В сумму включать только те цифры, которые больше 5
 * Вычислить secondSum как сумму каждого второго элемента. В сумму включать только те цифры, которые меньше 5
 * Вывести в консоль большее из значений firstSum и secondSum или слово "равны", если они совпадают
 *
 */

import java.util.Scanner;

public class Comparision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int firstSum = 0;
        int secondSum = 0;
        char[] array = input.toCharArray();
        for (int i = 3; i < input.length() - 1; i = i + 4) {
            if (Character.getNumericValue(array[i]) > 5) {
                firstSum += Character.getNumericValue(array[i]);
            }
        }
        for (int i = 1; i < input.length() - 1; i = i + 2) {
            if (Character.getNumericValue(array[i]) < 5) {
                secondSum += Character.getNumericValue(array[i]);
            }
        }

        if (firstSum == secondSum) System.out.println("равны");
        else if (firstSum > secondSum) System.out.println(firstSum);
        else System.out.println(secondSum);

    }
}
