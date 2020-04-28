package structures;

/**
 * Data structure type Node 
 * @author augusticor
 * @param <T> generic type for a node
 */
public class Node<T> {

	/**The information in the node of generic type*/
	protected T info;
	/**The node that is ahead from this node*/
	protected Node<T> next;

	public Node(T info, Node<T> next) {
		this.info = info;
		this.next = next;
	}

	public Node(T info){
		this.info = info;
		this.next = null;
	}

	/**
	 * Sets the next node from this
	 * @param next node to set
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}
}