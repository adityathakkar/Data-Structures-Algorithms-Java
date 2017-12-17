
public class SLinkedList<E> {
	private Node<E> head; 
	
	public SLinkedList() {
		head = new Node<E>(null, null);
	}
	
	public void addFirst(E e) {
		head.next = new Node<E>(e, head.next);
	}
	
	public void addLast(E e) { 
		Node<E> p = head;
		while (p != null) {
			p = p.next;
		}
		p.next = new Node<E>(e, null);
	}
	
	public void remove(E e) { 
		for (Node<E> p = head; p.next != null; p = p.next) {
			if (p.next.element.equals(e)) {
				p.next = p.next.next;
				break;
			}
		}
	}
	
	public void makeNull() {
		head.next = null;
		// Garbage collection handles the rest of the 
	}
	
	public void printList() {
		Node<E> p; 
		System.out.println("[");
		for (p = head.next; p != null; p = p.next) {
			System.out.println(p.element + " ");	
		}
		System.out.println(" ]");
	}
	
	public static void main(String[] args) {
		
	}

}
