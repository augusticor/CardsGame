package structures;

/**
 * The cursor of a circular list for go by it
 * @author augusticor
 * @param <T> generic type for a cursor, same that the circular list
 */
public class CircularListCursor<T> extends CircularList<T> {

	/**A cursor to go through the circular list*/
	private Node<T> cursor;

	public CircularListCursor(CircularList<T> circularList) {
		super(circularList);
		cursor = head;
	}

	/**
	 * @return if the cursor is out of the circular list
	 */
	public boolean isOut() {
		return (cursor.next == head);
	}

	/**
	 * Sets the cursor again at the start of the list
	 */
	public void reset() {
		cursor = this.head;
	}

	/**
	 * @return the information in the node where the cursor is
	 */
	public T getInfo() {
		return cursor.info;
	}

	/**
	 * Sets the cursor one position ahead from before
	 */
	public void next() {
		cursor = cursor.next;
	}

	/**
	 * Gets the next information where the cursor is
	 * @return next information where the cursor is
	 */
	public T nextInfo() {
		if (cursor.next == head) {
			T aux = cursor.next.info;
			cursor = cursor.next.next;
			return aux;
		}
		else {
			T aux = cursor.info;
			cursor = cursor.next;
			return aux;
		}
	}
}