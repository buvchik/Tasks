package jc01_2020.buvin.lesson06.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bankomat bnk = new Bankomat(20, 3, 2);

        Scanner scanner = new Scanner(System.in);

        int money = scanner.nextInt();
        if (!bnk.keepMoney(money))
            System.out.println("Обналичить нельзя!");

    }
}
