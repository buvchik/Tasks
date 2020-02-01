package jc01_2020.buvin.lesson02;

/*
 *
 * Среди трех чисел найти среднее по величине
 *
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();


           System.out.println(
                   ( second <= first && first <= third || third <= first && first <= second) ?  first :
                   ( first <= second && second <= third || third <= second && second <= first) ?  second :third
                            );

    }
}
