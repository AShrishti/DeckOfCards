package com.bridgelabz.deckOfCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class DeckOfCards {

	final int size = 52;
	Card[] deckOfCards = new Card[size];
	Card card;

	public DeckOfCards() {

		int count = 0;

		String[] suits = { "Diamonds", "Clubs", "Hearts", "Spades" };
		String[] values = { "King", "Queen", "Jack", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three",
				"Two", "Ace", };

		for (String s : suits) {
			for (String r : values) {

				card = new Card(s, r);
				this.deckOfCards[count] = card;
				count++;
			}
		}

	}

	public void ShuffleCards() {
		Random rand = new Random();
		int j;
		for (int i = 0; i < size; i++) {
			j = rand.nextInt(52);
			Card temp = deckOfCards[i];
			deckOfCards[i] = deckOfCards[j];
			deckOfCards[j] = temp;
		}
	}

	public void showCards() {
		System.out.println("---------------------------------------------");
		int count = 0;
		for (Card card : deckOfCards) {
			System.out.print(card.value + " of " + card.suit + "     ");
			count++;
			if (count % 4 == 0)
				System.out.println("");
		}
		System.out.println("---------------------------------------------");
	}

	public void dealCards(Players player1, Players player2, Players player3, Players player4) {

		int count = 0;

		for (Card card : deckOfCards) {

			if (count > 26) {
				player1.playCards[count % 13] = card;
				// System.out.println(player1.playCards[count/12].rank+"
				// "+player1.playCards[count/12].suit);
			} else if (count > 17) {
				player2.playCards[count % 13] = card;

			} // For distributing 9 cards to each players
			else if (count > 8) {
				player3.playCards[count % 13] = card;
			} else {
				player4.playCards[count % 13] = card;
			}
			count++;
		}
	}

}
