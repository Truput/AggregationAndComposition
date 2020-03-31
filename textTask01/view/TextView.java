package by.htp.oop.text.view;

import java.util.ArrayList;

import by.htp.oop.text.bean.Sentence;

public class TextView {
	
	public void printTextTitle(String textTitle) {
		
		System.out.println(textTitle);
		
	}
	
	public void printText(ArrayList<Sentence> sentences) {
		
		for (Sentence i: sentences) {
			
			System.out.print(i.toString() + " ");
		}
		
	}

}
