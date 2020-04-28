package structures;

/**
 * Data structure type stack (LIFO)
 * @author augusticor
 * @param <T> generic type of the stack
 */
public class OwnStack<T> {

	/**The last element added to the stack*/
	protected Node<T> top;
	/**Id for the stack*/
	protected int id;
	private static int COUNT = -1;
	
	public OwnStack() {
		top = null;
		id = COUNT++;
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	/**
	 * Adds information to the stack
	 */
	public void push(T info) {
		top = new Node<>(info, top);
	}
	
	/**
	 * Search for the information of the last element added
	 * @return the last element added
	 */
	public T pop() {
		T aux = top.info;
		top = top.next;
		return aux;
	}

	/**
	 * @return id of the stack
	 */
	public int getId() {
		return id;
	}
}