package main.java;

/*
 *
 * Вводится целое число, обозначающее код символа по таблице ASCII.
 * Определить, это код английской буквы или какой-либо иной символ.
 *
 */

import java.util.Scanner;

import static java.sql.Types.INTEGER;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
        char ch = (char) code;
        if ('a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z') {
            System.out.println("Буква == " + (char) code);
        } else System.out.println(" Не буква");

    }

}
