package structures;

/**
 * Data structure type Circular list for the deck of cards implementation
 * @author augusticor
 * @param <T> generic type for a circular list
 */
public class CircularList<T> {

	/**The head node of the circular list*/
	protected Node<T> head;

	public CircularList() {
		head = null;
	}

	public CircularList(CircularList<T> circularList) {
		head = circularList.head;
	}

	/**
	 * Adds an element into the circular list
	 * @param info generic data to insert
	 */
	public void addElement(T info) {
		if (head != null) {
			Node<T> aux = head;
			while (aux.next != head) {
				aux = aux.next;
			}
			aux.next = new Node<>(info, head);
		}
		else {
			head = new Node<>(info);
			head.setNext(head);
		}
	}
	
	/**
	 * Adds an element at the beginning of the circular list, and becomes the new head
	 * @param info the element to insert
	 */
	public void insertFirst(T info) {
		head = new Node<>(info, head);
	}

	/**
	 * Remove an element from the list, search it and remove it
	 * @param infoToRemove the element to remove
	 */
	public void remove(T infoToRemove) {
		Node<T> aux = head;
		while (aux.next.info != infoToRemove) {
			aux = aux.next;
		}
		Node<T> nextElement = aux.next;
		aux.next = nextElement.next;
	}
}