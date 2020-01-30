package main.java;

/*
*
* Определить, является ли год, который ввел пользователем, високосным или невисокосным.
*
* Високосные года делятся нацело на 4.
* Однако из этого правила есть исключение: столетия, которые не делятся нацело на 400, високосными не являются.
*
* 1980 - Високосный
* 1978 - Обычный
*
*/

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year%400==0) System.out.println("високосными не являются.");
        else if(year%4==0) System.out.println("Высокостный");
        else System.out.println("Невисокостный");

    }
}
