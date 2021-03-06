package jc01_2020.buvin.lesson08.task02;

/*
 *
 * На вход подается массив объектов Object. Реализовать статический параметризованный метод filter(), который принимает
 * в качестве параметров исходный массив и реализацию анонимного класса Filter и возвращает массив, состоящий только из
 * элементов, являющихся наследниками класса Number (для проверки используется ключевое слово instanceOf)
 *
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Application {

    static class Cat {
    }

    interface Filter {
        boolean apply(Object o);
    }

    static <T> List<T> filter(Object[] objects, Filter filter) {
        List<T> result = new ArrayList<>();
        for (Object n : objects) {
            if (filter.apply(n)) {
                result.add((T) n);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Object[] array = {"String", 1, 2.0, new Cat(), 85L, new Cat()};
        List arrayNumber = filter(array, new Filter() {
            @Override
            public boolean apply(Object o) {
                return o instanceof Number;
            }
        });

        System.out.print(Arrays.asList(arrayNumber));
    }


}
