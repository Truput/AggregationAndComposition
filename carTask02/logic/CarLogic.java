package by.htp.oop.car.logic;

import java.util.ArrayList;

import by.htp.oop.car.bean.Wheel;

public class CarLogic {

	public void drive() {

	}

	public void fuel() {

	}

	public ArrayList<Wheel> changeWheel(ArrayList<Wheel> wheels, int numberOfWheel, Wheel newWheel) {

		wheels.set(numberOfWheel, newWheel);

		return wheels;
	}

}
