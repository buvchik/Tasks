package jc01_2020.buvin.lesson04;

/*
 *
 * В одномерном массиве найти сумму элементов, находящихся между минимальным и максимальным элементами (их порядок не важен).
 * Сами минимальный и максимальный элементы в сумму не включать.
 *
 * Пример: {10, 30, 20, 15, 8, 21, 14}. max = 30, min 8. В сумму должны пойти значения 20 и 15. Ответ: 35
 *
 * Формат вывода:
 * одно число
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0], max = array[0];
        int minInd = 0, maxInd = 0;

        for (int i = 0; i < array.length; i++) {//find min and max
            if (array[i] > max) {
                max = array[i];
                maxInd = i;
            } else if (array[i] < min) {
                min = array[i];
                minInd = i;
            }
        }
        if (maxInd < minInd) {
            int i = minInd;
            minInd = maxInd;
            maxInd = i;
        }
        int sum = 0;
        for (int i = minInd + 1; i < maxInd; i++) {
            sum = sum + array[i];
        }

        System.out.println(sum);
    }
}
