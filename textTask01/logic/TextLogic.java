package by.htp.oop.text.logic;

import java.util.ArrayList;

import by.htp.oop.text.bean.Sentence;

public class TextLogic {

	public ArrayList<Sentence> increaseText(ArrayList<Sentence> sentences, Sentence newSentence) {

		sentences.add(newSentence);

		return sentences;
	}
	
}
