import java.util.EmptyStackException;

public class LLStack<E> {
	private Node<E> head;
	
	public LLStack() {
		head = null;
	}
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	public void push(E e) {
		head = new Node<E>(e, head);
	}
	
	public E pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			E e = head.element;
			head = head.next; 
			return e; 
		}
	}
	
	
	
}
