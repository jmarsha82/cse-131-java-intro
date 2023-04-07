package studio9;

import java.util.Iterator;

public class DoublyLinkedListOfInts implements IntList {
	private ListItem head, tail;
	private int size;
	
	
	public DoublyLinkedListOfInts(){
		ListItem headSen = new ListItem(66, null, null);
		ListItem tailSen = new ListItem(66, null, null);
		this.head = headSen;
		this.tail = tailSen;
		head.setNext(tail);
		tail.setPrev(head);
		
	}
	public Iterator<Integer> iterator() {
		return null;
	}

	@Override
	public void addFirst(int item) {
		ListItem newbie = new ListItem(item, this.head.getNext(), head);
		this.head.setNext(newbie);
		newbie.getPrev().setNext(newbie); 
	}

	@Override
	public void addLast(int item) {
		ListItem newbie = new ListItem(item, tail, this.tail.getPrev());
		this.tail.setPrev(newbie);
		newbie.getNext().setPrev(newbie);
	}

	@Override
	public int size() {
		int ans = 0;
		for (ListItem p = this.head.getNext(); p.getValue() != 66; p = p.getNext()) {
			ans = ans + 1;
		}
		this.size = ans;
		return ans;
	}

	@Override
	public int indexOf(int item) {
		int ans = 0;
		for (ListItem p = this.head.getNext(); p != null; p = p.getNext()) {
			if (p.getValue() == item)
				return ans;
			++ans;
		}
	return 0;
	}

	@Override
	public boolean remove(int item) {
		for (ListItem p = this.head; p.getNext() != null; p = p.getNext()) {
			if (p.getNext().getValue() == item) {
				// the thing we want to remove is one to the right of p
				//
				p.setNext(p.getNext().getNext());
				p.setPrev(p.getPrev().getPrev());
				return true;
			}
		}
		return false;

	}

	@Override
	public boolean isEmpty() {
		return this.size() == 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
