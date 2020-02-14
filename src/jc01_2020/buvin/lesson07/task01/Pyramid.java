package jc01_2020.buvin.lesson07.task01;

public class Pyramid extends Shape{

	private double side;
	private double height;

	@Override
	public double getVolume() {
		return side*height/3;
	}

	public Pyramid(double side, double height) {
		this.side = side;
		this.height = height;
	}
}
