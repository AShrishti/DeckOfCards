package com.bridgelabz.deckOfCards;

public class Card {

	String suit;
	String value;

	public Card(String suit, String value) {
		this.suit = suit;
		this.value = value;

	}

	public Card() {
	}

	public String toString() {
		return "\n" + value + " of " + suit;
	}

}
