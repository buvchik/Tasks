package jc01_2020.buvin.ClassWork.Task1;

import java.util.Random;

public class task1 {
    static private Dog[] dogArr = new Dog[10];

    static public Dog createDog() {
        return new Random().nextBoolean() ? new Dog() : null;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            dogArr[i] = createDog();
        }
    }
}
