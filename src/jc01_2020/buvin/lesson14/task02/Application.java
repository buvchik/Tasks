package jc01_2020.buvin.lesson14.task02;

/*
 *
 * При помощи FileReader И FileInputStream прочитать содержимое созданного в первом задании файла, убедиться, что они совпадают.
 *
 */

import java.io.*;

public class Application {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src/jc01_2020/buvin/lesson14/task01/lesson14-01.txt");
            String str = "";
            while (fr.ready()) {
                str += (char) fr.read();
            }
//            System.out.println(str);
            String str2 = "";
            FileInputStream fileInputStream = new FileInputStream("src/jc01_2020/buvin/lesson14/task01/lesson14-01.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            while (inputStreamReader.ready()) {
                str2 += (char) inputStreamReader.read();
            }
//            System.out.println(str2);
            if (str.equals(str2)) System.out.println("Совпадают");
            else System.out.println("Не совпадают");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
