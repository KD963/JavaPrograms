package com.bridgelabz.oop1;

public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		int number = suit.length * rank.length;
		String[] card = new String[number];

		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				card[rank.length * i + j] = rank[j] + " " + suit[i];
			}
		}

		for (int i = 0; i < card.length; i++) {
			int random = (int) (Math.random() * card.length);
			for (int j = 0; j < card.length; j++) {
				card[i] = card[j];
				card[j] = card[random];
				card[random] = card[i];
			}
		}

		int k = 0;
		String[] display = new String[36];

		for (int i = 0; i < 4; i++) {
			System.out.print("Player " + (i + 1) + ":");
			System.out.println("--------------------------");
			for (int j = 0; j < 9; j++) {
				display[j] = card[k];
				System.out.println("[ " + card[k] + " ] ");
				k++;
			}
		}
		System.out.println("");

	}

}
