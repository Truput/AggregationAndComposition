package by.htp.oop.text.bean;

import java.util.ArrayList;

public class Sentence {

	private ArrayList<Word> words;

	public Sentence(ArrayList<Word> words) {
		this.words = words;
	}

	public ArrayList<Word> getWords() {
		return words;
	}

	public void setWords(ArrayList<Word> words) {
		this.words = words;
	}

}
