package jc01_2020.buvin.lesson12;

/*
 *
 * Создать класс Car с полем enum Color (определите в нем хотя бы 5 цветов) и строковым полем, которое будет хранить
 * текстовое представление цвета. Конструктор принимает и инициализирует только поле-перечисление. Создаем 50 автомобилей
 * случайного цвета. В стриме:
 * 1) заполняем второе поле текущим значением цвета
 * 2) оставляем в стриме первые 10 автомобилей
 * 3) оставляем в стриме все автомобили, значение цвета которых равно цвету последнего элемента перечисления (не задавать
 * цвет в явном виде! я могу менять значения и количество элементов перечисления)
 * 4) вывести в консоль буленовское значение есть ли такой автомобиль
 *
 */

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Map<Car, String> listCar = new HashMap<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            listCar.put(new Car(Car.Color.values()[random.nextInt(5)].toString()), "");
        }

//        System.out.print(listCar.toString());
        listCar.forEach((key, value) -> listCar.put(key, key.carColor));

        Optional<Map.Entry<Car, String>> last = listCar.entrySet().stream()// find last Car
                .reduce((first, second) -> second);

        listCar.entrySet().stream()
				.limit(10)
                .filter(x -> x.getValue().equals(listCar.entrySet().stream()// find last Car
						.reduce((first, second) -> second).get().getValue()))
                .forEach(System.out::println);

        System.out.println(" Цвет последнего : "+last.get().getValue());
    }
}

class Car {
    enum Color {RED, BLUE, GREEN, BLACK, WHITE}

    String carColor;

    public Car(String carColor) {
        this.carColor = carColor;
    }

}
