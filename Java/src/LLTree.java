import java.util.NoSuchElementException;

import javax.management.InstanceNotFoundException;

// LinkedListTree
public class LLTree<E> {
	private TNode<E> root;
	
	public LLTree() {
		root = null;
	}
	
	public boolean isEmptyTree() {
		return (root == null);
	}
	
	private boolean isLead(TNode<E> t) {
		return ((t.right == null) && (t.left == null) && (t != null));
	}
	
	private void printTree(TNode<E> t) {
		// In order traversal 
		if (t != null) {
			printTree(t.left);
			System.out.println(t.element);
			printTree(t.right);
		}
	}
	
	private E findTree(E e, TNode<E> t) {
		// Log n runtime 
		if (t == null) {
			return null;
		}
		if (e.compareTo(t.element) < 0) {
			return(findTree(e, t.left));
		}
		if (e.compareTo(t.element) > 0) {
			return(findTree(e, t.right));
		}
		else {
			return (t.element);
		}
	}
	
	private E findTreeMin() {
		TNode<E> t = root; 
		if (t == null ) {
			throw new NoSuchElementException();
		}
		else { 
			while (t.left != null) {
				t = t.left;
			}
			return t.element;
		}
	}
	
	private E findTreeMax() {
		TNode<E> t = root; 
		if (t == null) {
			throw new NoSuchElementException();
		} 
		else {
			while (t.right != null) {
				t = t.right;
			}
			return t.element; 
		}
	}
	
	private TNode<E> insertTree(E val, TNode<E> t) {
		if (t == null) {
			t = new TNode<E>(val, null, null);
		}
		else if (val.compareTo(t.element) < 0) {
			t.left = insertTree(val, t.left);
		}
		else if (val.compareTo(t.element) > 0) {
			t.right = insertTree(val, t.left);
		}
		else {
			throw new DuplicateItemException();
		}
		return t;
	}
	
	private TNode<E> deleteTree(E val, TNode<E> t) {
		if (t == null ) {
			throw new InstanceNotFoundException();
		}
		if (val.compareTo(t.element) < 0)) {
			t.left = deleteTree(val, t.left);
		}
		else if (val.compareTo(t.element) > 0) {
			t.right = deleteTree(val, t.right);
		}
		else if (t.left != null && t.right != null) {
			t.element = (findMin(t.right)).element;
			t.right = removeMin(t.right);
		}
		else {
			t = (t.left != null) ? t.left : t.right; 
		}
		return t;
	}
	
	private TNode<E> removeMin(TNode<E> t) {
		if (t == null) {
			throw new InstanceNotFoundException(); 
		}
		else if (t.left != null) {
			t.left = removeMin(t.left);
			return t;
		}
		else {
			return t.right;
		}
	}
	
	public boolean compareTo(E val) {
		if ()
	}
	
}
