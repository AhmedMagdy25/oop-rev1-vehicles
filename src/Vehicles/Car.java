package Vehicles;

public class Car implements vehicle{
	GearType gearType = GearType.MANUAL;
	private final int MAX_GEAR = 5;
	private final int MIN_GEAR = 0;
	private int speedLimit = 20;
	private final int SPEED_RATE = 5;
	private int speed = 0;
	private int gear = 0;

	public Car() {
		init();
	}

	@Override
	public void init() {
		System.out.println("init...");
	}
	
	@Override
	public int speedUp(int increaseVal) {
		if(speed < speedLimit)
			speed += increaseVal;
		return speed;
	}

	@Override
	public int speedDown(int decreaseVal) {
		if(speed >= 0)
			speed -= decreaseVal;
		return speed;
	}
	
	public void changeGear(int gearNum) {
		if(gearNum <= MAX_GEAR && gearNum >= MIN_GEAR) {
			gear = gearNum;
			if(gear == 1) 
				speedLimit = 20;
			else if(gear == 2) 
				speedLimit = 40;
			else if(gear == 3) 
				speedLimit = 60;
			else if(gear == 4) 
				speedLimit = 80;
			else if(gear == 5) 
				speedLimit = 100;
			System.out.println("changing to gear"+gear);
			while(speed > speedLimit) {
				System.out.println("the speed is decreased to "+speedDown(SPEED_RATE)+"km/h");
			}
		}
	}
	
	public void move() {
		System.out.println("moving...");
		while(speed < speedLimit) {
			System.out.println("the speed is increased to "+speedUp(SPEED_RATE)+"km/h");
		}
	}

	public void stop() {
		System.out.println("stopping...");
		while(speed > 0) {
			System.out.println("the speed is decreased to "+speedDown(SPEED_RATE)+"km/h");
		}
		gear = 0;
	}

	@Override
	public String toString() {
		return "Car [gearType=" + gearType + ", speed=" + speed + ", gear=" + gear + "]";
	}

}
