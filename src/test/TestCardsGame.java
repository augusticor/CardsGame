package test;

import cardsType.*;
import models.DeckOfCard;

/**
 * This program creates a deck o cards (English type or Spanish type or combined) and shuffles it
 * Design pattern : M.V.C. (some a kind)
 * Used I.D.E: Eclipse
 * This class is the test of the algorithm to shuffle the cards
 * @author augusticor
 * @version 1.1
 * @category data structures
 */
public class TestCardsGame {

	public static void main(String[] args) {
		//ENGLISH deck of cards :
		DeckOfCard<EnglishCardSymbols, EnglishCardValue> deckOfCards = new DeckOfCard<>(EnglishCardSymbols.values(), EnglishCardValue.values());
		
		//SPANISH deck of cards  :
//		DeckOfCard<SpainCardSymbols, SpainCardValue> deckOfCards = new DeckOfCard<>(SpainCardSymbols.values(), SpainCardValue.values());
		
		//Combined deck of cards :
//		DeckOfCard<SpainCardSymbols, EnglishCardValue> deckOfCards = new DeckOfCard<>(SpainCardSymbols.values(), EnglishCardValue.values());
		
		//Shuffle the deck
		deckOfCards.shuffle(43);
		
		System.out.println("Cards : \n");

		//Shows the deck of cards
		while (!deckOfCards.isEmpty()) {
			System.out.println(deckOfCards.pop());
		}
	}
}