package studio9;

/**
 * This is a "worker class" that helps us implement a Linked List.
 * Each element of the linklist is a ListItem
 * A ListItem has-a  integer value that it contains, and
 * it has-a reference to yet another ListItem, which may be null.
 * 
 * We are going to explore 3 different kinds of linked lists.
 * Two of them are singly linked:  each item has a reference to
 * just one other item.  One is doubly linked:  it has two references
 * to items.
 * 
 * This class represents the bubbles (nodes) you see in 23.pdf page 2
 * 
 * We will one instance of this class for everything that is in a list.
 *
 */
public class ListItem {
	
	final private int      value;  // the contained value in this item
	private ListItem next, prev;   // the next item in this list
	
	public ListItem(int value, ListItem next, ListItem prev) {
		this.value = value;
		this.next  = next;
		this.prev = prev;
	}
	
	/**
	 * I've looked ahead and know this will be useful...
	 * @param newNext the "new next" of this item
	 */
	public void setNext(ListItem newNext) {
		this.next = newNext;
	}

	public ListItem getPrev() {
		return prev;
	}

	public void setPrev(ListItem newPrev) {
		this.prev = newPrev;
	}

	// a getter, or accessor
	//
	public ListItem getNext() {
		return next;
	}

	public int getValue() {
		return value;
	}
 
}
