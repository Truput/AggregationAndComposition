package by.htp.oop.state.view;

import java.util.ArrayList;

import by.htp.oop.state.bean.Region;

public class StateView {

	public void printStateCenter(String StateCenter) {

		System.out.println(StateCenter);
	}

	public void printNumberOfRegions(int count) {

		System.out.println("Количество областей в государстве = " + count);
	}

	public void printStateSquare(int stateSquare) {

		System.out.println("Площадь государства = " + stateSquare);
	}

	public void printRegionCenters(ArrayList<Region> regions) {

		for (Region i : regions) {

			System.out.println("Областной центр " + i.getRegionName() + " области это " + i.getRegionCenter());
		}
	}

}
