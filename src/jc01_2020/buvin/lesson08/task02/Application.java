package jc01_2020.buvin.lesson08.task02;

/*
 *
 * На вход подается массив объектов Object. Реализовать статический параметризованный метод filter(), который принимает
 * в качестве параметров исходный массив и реализацию анонимного класса Filter и возвращает массив, состоящий только из
 * элементов, являющихся наследниками класса Number (для проверки используется ключевое слово instanceOf)
 *
 */

public class Application {

    static class Cat {
    }

    interface Filter {
        boolean apply(Object o);
    }

    public static Number[] filter(Object[] objects, Filter filter) {
        Number[] a = new Number[objects.length];
        int i = 0;
        for (Object n : objects) {
            if (filter.apply(n)) {
                a[i] = (Number) n;
                i++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Object[] array = {"String", 1, 2.0, new Cat(), 85L, new Cat()};
        Number[] arrayNumber = filter(array, new Filter() {
            @Override
            public boolean apply(Object o) {
                if (o instanceof Number) return true;
                else return false;
            }
        });
        for (Number n : arrayNumber) {
            if (n != null) System.out.println(n);
        }
    }


}
