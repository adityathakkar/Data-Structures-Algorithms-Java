
public class LLQueue<E> {
	private Node<E> front;
	private Node<E> back;
	
	public LLQueue() {
		// Uses dummy header node
		front = back = new Node<E>(null,null);
	}
	
	public boolean isEmpty() {
		return (front == back);
	}
	
	public int getSize() {
		int size = 0;
		Node<E> p = front;
		while(p.next != null) {
			p = p.next;
			size++;
		}
		return size;
	}
	
	public void enqueue(E e) {
		back.next = new Node<E>(e, null);
		back = back.next; 
	}
	
	public E dequeue(E e) {
//			if (isEmpty()) {
//				throw new EmptyQueueException("Queue Underflow");
//			}
//			else {
				if (front.next == back) {
					back = front;
				}
				E val = front.next.element;
				front.next = front.next.next;	
				return val;
//			}
	}
	
 }
