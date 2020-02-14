package jc01_2020.buvin.lesson07.task01;

/*
 *
 * Собираем чемодан
 *
 * Класс Box является контейнером, он можем содержать в себе другие фигуры. Реализовать в нем конструктор, в который
 * передается объем коробки, и метод add(), который принимает на вход Shape и кладет в коробку.
 * Нужно добавлять новые фигуры до тех пор, пока для них хватает места в Box (будем считать только объём, игнорируя форму.
 * Допустим, мы переливаем жидкость). Если места для добавления новой фигуры не хватает, то метод должен вернуть false.
 * Все сущности должны являть наследниками класса Shape.
 * Параллелепипед - прямоугольный
 *
 */

public class Application {

	public static void main(String[] args) {
		Box box= new Box(1000);
		Shape cylinder = new Cylinder(1 ,5);
		Shape piramid = new Pyramid(20 ,27);
		Shape parallel = new Parallelepiped(20,5 ,5);
		Shape sphere = new Sphere(5);
		System.out.println(box.Add(cylinder) +" box volume = "+ box.getVolume()+" || "+ cylinder.getClass().getSimpleName() +" volume = "+cylinder.getVolume());
		System.out.println(box.Add(piramid)+" box volume = "+ box.getVolume()+" || "+ piramid.getClass().getSimpleName() +" volume = "+piramid.getVolume());
		System.out.println(box.Add(parallel)+" box volume = "+ box.getVolume()+" || "+ parallel.getClass().getSimpleName() +" volume = "+parallel.getVolume());
		System.out.println(box.Add(sphere)+" box volume = "+ box.getVolume()+" || "+ sphere.getClass().getSimpleName() +" volume = "+sphere.getVolume());

	}

}
