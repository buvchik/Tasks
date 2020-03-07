package jc01_2020.buvin.lesson12;

/*
 *
 * Создать класс Cat со строковым полем имени и числовым полем для количества оставшихся жизней. Создать функциональный
 * интерфейс, который сравнит двух котов и вернет имя кота с большим количеством жизней.
 *
 */

public class Task5 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Кот 1", 2);
        Cat cat2 = new Cat("Кот 2", 4);
        myComparator myComparator = ((x, y) -> {
            if (x.yearLife > y.yearLife)
                return x;
            else return y;
        });
        System.out.println(myComparator.compare(cat1, cat2).name);
    }
}

class Cat {
    String name;
    int yearLife;

    public Cat(String name, int yearLife) {
        this.name = name;
        this.yearLife = yearLife;
    }
}

interface myComparator {
    Cat compare(Cat c, Cat c1);
}