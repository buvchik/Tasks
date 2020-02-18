package jc01_2020.buvin.lesson09.task06;

/*
 *
 * Создать и заполнить любыми числами два списка: обычный и связанный. Размер списков - 1 млн элементов.
 * В каждый список добавить 100_000 раз в нулевую позицию значение 0. Вывести в консоль длительности вставки 100_000
 * элементов для обычного и связанного списков.
 *
 * N.B. Поищите сами как засечь время.
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

    public static void main(String[] args) {
        // Объявить список
        ArrayList<Double> listArray = new ArrayList<>();
        LinkedList<Double> listLinked = new LinkedList<>();
		for (int i = 0; i < 1_000_00; i++) {
			// Заполнить список
			listArray.add(Math.random());
			listLinked.add(Math.random());
		}

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_00_000; i++) {
            listArray.add(0, 0d);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Arraylist = " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_00_000; i++) {
            listLinked.addFirst(0d);
        }
        endTime = System.currentTimeMillis();
        System.out.print("Linkedlist = " + (endTime - startTime));
    }

}
