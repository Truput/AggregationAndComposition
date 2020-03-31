package by.htp.oop.text.bean;

import java.util.ArrayList;

public class Text {

	private ArrayList<Sentence> sentences;
	private String textTitle;

	public String getTextTitle() {
		return textTitle;
	}

	public void setTextTitle(String textTitle) {
		this.textTitle = textTitle;
	}

	public ArrayList<Sentence> getSentences() {
		return sentences;
	}

	public void setSentences(ArrayList<Sentence> sentences) {
		this.sentences = sentences;
	}

}
