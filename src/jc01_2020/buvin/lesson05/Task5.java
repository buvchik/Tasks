package jc01_2020.buvin.lesson05;

/*
 *
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено
 * "abc cde def", то должно быть выведено "abcdef".
 *
 * Формат вывода:
 * строка
 *
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        str = str.replace(" ", ""); //delete " "
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length(); i++) {  //search repeat
            for (int j = 1; j < stringBuilder.length(); j++) {
                if (stringBuilder.charAt(i) == stringBuilder.charAt(j) && i != j)
                    stringBuilder.deleteCharAt(j);
            }
        }
        System.out.println(stringBuilder.toString());

        /*char[] chArr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {  //search repeat
            for (int j = 1; j < str.length(); j++) {
                if (chArr[i] == chArr[j] && i != j)
                    chArr[j] = ' ';
            }
        }
        String result = "";
        for (char ch : chArr) {
            if (ch != ' ') result += ch;
        }

        System.out.println(result);*/


    }
}
