
public class DNode<E> {
	E element; 
	DNode<E> prev;
	DNode<E> next; 
	
	public DNode(E e, DNode<E> n, DNode<E> p){
		element = e; 
		next = n;
		prev = p;
	}
}
