package models;

/**
 * The card of a deck
 * @author augusticor
 * @param <S> card symbol
 * @param <V> card value
 */
public class Card<S, V> {

	private S symbol;
	private V value;
	
	public Card(S symbol, V value) {
		this.symbol = symbol;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return symbol + " " + value;
	}
}