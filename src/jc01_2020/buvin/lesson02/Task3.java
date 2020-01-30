package main.java;

/*
*
* Вводятся два целых числа. Проверить делится ли первое на второе.
* Вывести на экран сообщение об этом, а также остаток (если он есть) и частное (в любом случае)
*
*/

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long first = scanner.nextLong();
        long second = scanner.nextLong();
        if (second==0) System.out.println("no Делиться");
        else
        if (first%second==0) {

            System.out.println("Целая часть=" +(int)first/second);
        }
        else {

            System.out.println("Целая часть =" +(int)first/second);
            System.out.println("Остатк =" +first%second);
        }

    }
}
