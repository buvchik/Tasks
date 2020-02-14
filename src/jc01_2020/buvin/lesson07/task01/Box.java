package jc01_2020.buvin.lesson07.task01;

public class Box {
    double volume;

    public Box(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public boolean Add(Shape shape) {
        if (volume - shape.getVolume() > 0) {
            volume -= shape.getVolume();
            return true;
        } else return false;

    }
}
