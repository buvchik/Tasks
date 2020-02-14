package jc01_2020.buvin.lesson07.task01;

public class Parallelepiped extends Shape {

	private double length;
	private double width;
	private double height;

	public Parallelepiped(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	@Override
	public double getVolume() {
		return length*width*height;
	}
}
