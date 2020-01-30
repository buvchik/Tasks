package main.java;

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

//        double srArif = (first + second + third) / 3;
//
//        first = (int) (first - srArif);
//        second =(int) (second - srArif);
//        third = (int) (third - srArif);
//
//            if (first <= second && first <= third) System.out.println(first + (int) srArif);
//              else
//            if (second <= first && second <= third) System.out.println(second + (int) srArif);
//             else
//                 System.out.println(third + (int) srArif);
             int dd = 0;

        int i = (first <= second && first <= third) ? dd = first :
                (second <= first && second <= third) ? dd = second :
                        (third <= first && third <= second) ? dd = third:0;
           System.out.println(i);
    }
}
