package com.ezequiel.cards;

public class Card {
	
	String number = "884523997655";

	public String getNumber() {
		return number;
	}

	public void setNumber(String tipo) {
		this.number = tipo;
	}

	@Override
	public String toString() {
		return "Card: " + number;
	}
}
