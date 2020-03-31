package by.htp.oop.car.bean;

import java.util.ArrayList;

public class Car {

	private Engine carEngine;
	private ArrayList<Wheel> wheels;
	private String carMake;

	public Engine getCarEngine() {
		return carEngine;
	}

	public void setCarEngine(Engine carEngine) {
		this.carEngine = carEngine;
	}

	public ArrayList<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(ArrayList<Wheel> wheels) {
		this.wheels = wheels;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

}
