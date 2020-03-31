package by.htp.oop.state.view;

import java.util.ArrayList;

import by.htp.oop.state.bean.Region;

public class StateView {

	public void printStateCenter(String StateCenter) {

		System.out.println(StateCenter);
	}

	public void printNumberOfRegions(int count) {

		System.out.println("���������� �������� � ����������� = " + count);
	}

	public void printStateSquare(int stateSquare) {

		System.out.println("������� ����������� = " + stateSquare);
	}

	public void printRegionCenters(ArrayList<Region> regions) {

		for (Region i : regions) {

			System.out.println("��������� ����� " + i.getRegionName() + " ������� ��� " + i.getRegionCenter());
		}
	}

}
