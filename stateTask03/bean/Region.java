package by.htp.oop.state.bean;

import java.util.ArrayList;

public class Region {

	private ArrayList<District> districts;
	private String regionName;
	private String regionCenter;

	public String getRegionCenter() {
		return regionCenter;
	}

	public void setRegionCenter(String regionCenter) {
		this.regionCenter = regionCenter;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public ArrayList<District> getDistricts() {
		return districts;
	}

	public void setDistricts(ArrayList<District> districts) {
		this.districts = districts;
	}

}
