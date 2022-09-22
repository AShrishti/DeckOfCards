package com.bridgelabz.deckOfCards;

public class Players {
	String name;
	Card[] playCards = new Card[13];

	public Players(String name) {
		this.name = name;
	}

	public void ShowPlayerCards() {
		System.out.println("---------------------------------------------");
		for (Card card : playCards) {
			if (card != null)
				System.out.println(card.value + "  of  " + card.suit);
		}
		System.out.println("---------------------------------------------");
	}

	public String getName() {
		return name;
	}

}
