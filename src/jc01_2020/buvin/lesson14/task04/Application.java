package jc01_2020.buvin.lesson14.task04;

/*
 *
 * Десериализовать объект из предыдущей задачи. Вывести в консоль значения всех полей
 *
 */

import jc01_2020.buvin.lesson14.task03.Car;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Application {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/jc01_2020/buvin/lesson14/resource/Car.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Car car = (Car) objectInputStream.readObject();
            System.out.println("Name: " + car.name);
            System.out.println("Color: " + car.color);
            System.out.println("Price: " + car.price);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
