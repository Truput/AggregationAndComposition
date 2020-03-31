package by.htp.oop.state.bean;

import java.util.ArrayList;

public class District {

	private City districtCenter;
	private ArrayList<City> cities;
	private ArrayList<Village> villages;

	public City getDistrictCenter() {
		return districtCenter;
	}

	public void setDistrictCenter(City districtCenter) {
		this.districtCenter = districtCenter;
	}

	public ArrayList<City> getCities() {
		return cities;
	}

	public void setCities(ArrayList<City> cities) {
		this.cities = cities;
	}

	public ArrayList<Village> getVillages() {
		return villages;
	}

	public void setVillages(ArrayList<Village> villages) {
		this.villages = villages;
	}

}
