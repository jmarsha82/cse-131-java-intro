package lab9;

import java.util.Iterator;

public class ListItem {
	//
	// Important:  Do NOT make these instance variables private
	// Our testing needs to be able to access them, so leave their
	//   declarations as you see them below.
	//
	final int number;
	ListItem next;

	/**
	 * Creates a single list item.
	 * @param number the value to be held in the item
	 * @param next a reference to the next item in the list
	 */
	ListItem(int number, ListItem next) {
		this.number = number;
		this.next   = next;
	}

	/**
	 * Return a copy of this list using recursion.  No
	 * credit if you use any iteration!  All existing lists should remain
	 * intact -- this method must not mutate anything.
	 * @return
	 */
	public ListItem duplicate() {
		if (next == null) {
			return new ListItem(this.number, null);  //base case, goes to you reach a null value in the list else it assigns it to temp
		}
		else {
			ListItem temp = next.duplicate();  // moves to the next value copying to temp until the list is empty
			return new ListItem(this.number, temp);
		}
	}
	/**
	 * Recursively compute the number of elements in the list. No
	 * credit if you use any iteration!  All existing lists should remain
	 * intact.
	 * @return
	 */
	public int length() {
		if(this .next == null){  //if the next item is null then there was one item
			return 1;
		}
		else
			return 1 + this.next.length();// FIXME  //else it will work through the elements adding 1 to this.next every time
	}

	/**
	 * Return a new list, like duplicate(), but every element
	 * appears n times instead of once.  See the web page for details.
	 * You must do this method iteratively.  No credit
	 * if you use any recursion!
	 * @param n a positive (never 0) number specifying how many times to copy each element
	 * @return
	 */

	public ListItem stretch(int n) {
		ListItem listOld = this;  // the original list
		ListItem firstItem = new ListItem (this.number, this.next);  // creates a new list at the beginning
		ListItem listNew = firstItem; // creates a new list of that one item
		while (listOld!=null){  // as long as the old list still has items in it
			for (int i=0; i<n; i++){ 
				listNew.next= new ListItem(listOld.number, listOld.next); // add a new list item to listNew for ever time n
				listNew = listNew.next; 
			} 
			listOld = listOld.next; //increment the original list
		}  
		return firstItem.next; 
	} 

	/**
	 * Return the first ListItem, looking from "this" forward,
	 * that contains the specified number.  No lists should be
	 * modified as a result of this call.  You may do this recursively
	 * or iteratively, as you like.
	 * @param n
	 * @return
	 */

	public ListItem find(int n) {
		if (this.number == n){ // if you find n in the list return the this
			return this; 		} 
		else if (this.next!= null){ //if it is not empty but also not the number, check the next one
			if (this.next.number == n){
				return this.next; 
			} 
			else{ 
				return this.next.find(n); //if it is neither the first or second then recursive move to the next one
			}
		}  		 		
		else return null;
	}


	/**
	 * Return the maximum number contained in the list
	 * from this point forward.  No lists should be modified
	 * as a result of this call.  You may do this method recursively
	 * or iteratively,as you like.
	 * @return
	 */

	public int max() {
		if (this.next == null || this.number> this.next.max()){ // if the next number is the end or the max return the number
			return this.number; 
		} 
		else return this.next.max(); // else check the first instance again
	} 


	/**
	 * Returns a copy of the list beginning at ls, but containing
	 * only elements that are even.
	 * @param ls
	 * @return
	 */
	public static ListItem evenElements(ListItem ls) {
		if (ls == null){  //if the number is null thenm the list is empty, return null
 			return null; 
 		} 
 		else { 
 			if (ls.number % 2 == 0){ 
 				return new ListItem (ls.number, ListItem.evenElements(ls.next)); //if the number is even, create a new list item and run
 			} 																	// method again on next number
 			else { 
 				return ListItem.evenElements(ls.next); //if it is neither the end of even run the method again
 			} 
 		} 
 	} // FIXME

	/**
	 * Returns a string representation of the values reachable from
	 * this list item.  Values appear in the same order as the occur in
	 * the linked structure.  Leave this method alone so our testing will work
	 * properly.
	 */
	public String toString() {
		if (next == null)
			return ("" + number);
		else
			return (number + " " + next); // calls next.toString() implicitly
	}

}
