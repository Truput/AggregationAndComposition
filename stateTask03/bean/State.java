package by.htp.oop.state.bean;

import java.util.ArrayList;

public class State {

	private ArrayList<Region> regions;
	private String stateCenter;
	private int stateSquare;

	public ArrayList<Region> getRegions() {
		return regions;
	}

	public void setRegions(ArrayList<Region> regions) {
		this.regions = regions;
	}

	public String getStateCenter() {
		return stateCenter;
	}

	public void setStateCenter(String stateCenter) {
		this.stateCenter = stateCenter;
	}

	public int getStateSquare() {
		return stateSquare;
	}

	public void setStateSquare(int stateSquare) {
		this.stateSquare = stateSquare;
	}

}
