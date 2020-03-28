package jc01_2020.buvin.lesson14.task03;

/*
 *
 * Создать объект любого пользовательского класса минимум с тремя полями с ненулевыми значениями.
 * Объявить любое поле несериализуемым.
 * Сериализовать этот объект в файл lesson14/resource/<userClassName>.dat.
 *
 */

import java.io.*;

public class Application {

    public static void main(String[] args)  {
        Car car = new Car("Mersedes", "White", 100000);

        File folder = new File("src/jc01_2020/buvin/lesson14/resource");
        if (!folder.exists()) {
            folder.mkdir();
        }

        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(folder+"/Car.dat"));
            objectOutputStream.writeObject(car);
            objectOutputStream.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }

    }

}
