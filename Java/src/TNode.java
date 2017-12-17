// Tree node class
public class TNode<E> {
	E element;
	TNode<E> left;
	TNode<E> right;
	
	public TNode(E e, TNode<E> l, TNode r) {
		this.element = e;
		this.left = l;
		this.right = r;
	}
	
//	public boolean compareTo(E val) {
//		if (this.element > val) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
}
