package by.htp.oop.state.logic;

import java.util.ArrayList;

import by.htp.oop.state.bean.Region;

public class StateLogic {

	public ArrayList<Region> initRegions(ArrayList<Region> regions, Region region) {

		regions.add(region);

		return regions;
	}

	public int countRegions(ArrayList<Region> regions) {

		int count = 1;

		for (Region i : regions) {
			count++;
		}

		return count;
	}

}
