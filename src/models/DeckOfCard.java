package models;

import java.util.Random;
import structures.CircularList;
import structures.CircularListCursor;
import structures.OwnStack;

/**
 * Deck of cards 
 * @author augusticor
 * @param <S> card symbol
 * @param <V> card value
 */
public class DeckOfCard<S, V> extends OwnStack<Card<S, V>> {

	/**
	 * Constructor of the class
	 * @param symbolEnum data of the symbol enumeration
	 * @param cardValuesEnum data of the cards enumeration
	 */
	public DeckOfCard(S[] symbolEnum, V[] cardValuesEnum) {
		super();
		for (S symbol : symbolEnum) {
			for (V value : cardValuesEnum) {
				push(new Card<>(symbol, value));
			}
		}
	}

	/**
	 * Shuffles the deck of cards (barajar)
	 * @param stacksNumber number of the stacks the method will shuffle
	 * @return one deck of cards stack shuffled
	 */
	public OwnStack<Card<S, V>> shuffle(int stacksNumber) {
		Random randomize = new Random();
		CircularList<OwnStack<Card<S, V>>> circularList = new CircularList<>();
		for (int i = 0; i < stacksNumber; i++) {
			circularList.addElement(new OwnStack<>());			
		}
		CircularListCursor<OwnStack<Card<S, V>>> cursor = new CircularListCursor<>(circularList);
		while (!this.isEmpty()) {
			while (cursor.getInfo().getId() != randomize.nextInt(stacksNumber)) {
				cursor.nextInfo();
			}
			cursor.nextInfo().push(this.pop());
		}
		cursor.reset();
		while (!cursor.isOut()) {
			OwnStack<Card<S, V>> auxCard2 = cursor.nextInfo();
			while (!auxCard2.isEmpty()) {
				this.push(auxCard2.pop());
			}
		}
		return this;
	}
}