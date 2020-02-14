package jc01_2020.buvin.lesson07.task01;

public class Sphere extends Shape{

	private double radius;

	@Override
	public double getVolume() {
		return 3*Math.PI*Math.pow(radius,3)/4;
	}

	public Sphere(double radius) {
		this.radius = radius;
	}
}
