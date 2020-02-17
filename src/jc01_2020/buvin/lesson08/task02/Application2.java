package jc01_2020.buvin.lesson08.task02;

/*
 *
 * На вход подается массив объектов Object. Реализовать статический параметризованный метод filter(), который принимает
 * в качестве параметров исходный массив и реализацию анонимного класса Filter и возвращает массив, состоящий только из
 * элементов, являющихся наследниками класса Number (для проверки используется ключевое слово instanceOf)
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {

    static class Cat {
    }

    interface Filter {
        boolean apply(Object o);
    }

    static <T> T[] filter(Object[] objects, Filter filter) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < objects.length; i++) {
            if (filter.apply(objects[i])) {
                result.add((T) objects[i]);
            }
        }
        return (T[]) result.toArray();
    }

    public static void main(String[] args) {
        Object[] array = {"String", 1, 2.0, new Application.Cat(), 85L, new Application.Cat()};
        Object[] result = filter(array, o -> o instanceof Number);
        System.out.println(Arrays.toString(result));

    }
}
