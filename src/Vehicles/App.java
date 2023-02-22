package Vehicles;

public class App {
	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		car.changeGear(3);
		car.move();
		car.changeGear(5);
		System.out.println(car.toString());
		car.changeGear(2);
		System.out.println(car.toString());
		car.stop();
		System.out.println(car.toString());
	}
}