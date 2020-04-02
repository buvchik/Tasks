package jc01_2020.buvin.lesson14.task03;

import java.io.Serializable;

public class Car implements Serializable {
    public String name;
    public String color;
    public transient int price;
    private static final long serialVersionUID = 1L;


    public Car(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
}
