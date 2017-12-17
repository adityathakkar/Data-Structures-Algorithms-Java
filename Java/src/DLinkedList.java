public class DLinkedList<E> {
	private DNode<E> head;
	private DNode<E> tail;
	
	public DLinkedList() {
		head = new DNode<E>(null, null, null); 
		tail = new DNode<E>(null, null, head);
		head.next = tail; 
	}
	
	public void addFirst(E e) {
		DNode<E> p = new DNode<E>(e, head.next, head); 
		head.next = p;
		p.next.prev = p;
	}
	
	public void remove(E e) { 
		DNode<E> p = head.next;
		while(p != tail && !p.element.equals(e)) {
			p = p.next;
		}
		if (p != tail) {
			p.prev.next = p.next;
			p.next.prev = p.prev;
		}
	}
	
	public static void main(String[] args) {
	
	}

}

