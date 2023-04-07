package lab8;

import java.util.Iterator;
import java.util.LinkedList;

import exercises8.Person;
import exercises8.Valuable;

public class Polynomial{

	final private LinkedList<Double> list;
/**
 * Constuctor that creates the linked list
 */
	public Polynomial() {
		this.list = new LinkedList<Double>();
	}
/**
 * creates the toString by iteration
 */
	public String toString() {
		int n = list.size();
		String ans = "";
		int i;
		for(i=0; i<n-1; i++){
			ans+= list.get(i) + "x^" + i + "+";
		}
		if(!list.isEmpty()){
			ans += list.getLast() + "^x" + i;
		}
		return ans;
	}
/**
 * addTerm adds a term to the polynomial
 * @param coeff is the value that is passed into the polynomial
 * @return Polynomial object
 */
	public Polynomial addTerm(double coeff) {
		list.add(coeff);
		return this;
	}
	/**
	 * evaluates the polynomial through recursion
	 * @param x is the value that the polynomial is evaluated on
	 * @returns a double answer based off x
	 */
	public double evaluate(double x) {
		Iterator<Double> itr = list.iterator();
		return helper(itr, 0, x);
	}
/**
 * helper for the evaluate method
 * @param itr passed from evaluate method
 * @param e power to be raised to
 * @param x value passed in to solve on
 * @returns method call on itself
 */
	public double helper (Iterator <Double> itr, int e, double x) {
		if(!itr.hasNext()){
			return 0;
		}
		else
			return itr.next() * Math.pow(x, e) + helper(itr,e+1, x);
	}
	/**
	 * calculates the dervative by iterating through the linked list
	 * @return a new polynomial
	 */
	public Polynomial derivative() {
		Polynomial polyDeriv = new Polynomial();
		int size = this.list.size();
		for(int i=1;i<size;++i){
			if(this.list.get(i) != 0){
				polyDeriv.addTerm(this.list.get(i) * i);
			}
			else{
				polyDeriv.addTerm(0);
			}
		}
		return polyDeriv;   // FIXME
	}
/**
 * adds to Polynomial Objects together
 * @param another Polynomial passed in to add to
 * @return new polynomial
 */
	public Polynomial sum(Polynomial another) {
		Polynomial newPoly = new Polynomial();
		int polyOne = list.size();
		int polyTwo = another.getList().size();
		int size = 0;
		if(polyOne > polyTwo){size = polyOne;}
		else{size = polyTwo;}
		for(int i=0;i<size;++i){
			if(i < polyOne && i < polyTwo){
				newPoly.addTerm(list.get(i) + another.getList().get(i));
			}
			else if(i < polyOne && i >= polyTwo){
				newPoly.addTerm(list.get(i));
			}
			else if(i >= polyOne && i < polyTwo){
				newPoly.addTerm(another.getList().get(i));
			}
		}
		return newPoly;   // FIXME
	}
/**
 * get method
 * @return the list
 */
	public LinkedList<Double> getList() {
		return list;
	}

	/**
	 * This is the "equals" method that is called by
	 *    assertEquals(...) from your JUnit test code.
	 *    It must be prepared to compare this Polynomial
	 *    with any other kind of Object (obj).  Eclipse
	 *    automatically generated the code for this method,
	 *    after I told it to use the contained list as the basis
	 *    of equality testing.  I have annotated the code to show
	 *    what is going on.
	 */
/**
 * equals method generated from Java library
 */
	public boolean equals(Object obj) {
		// If the two objects are exactly the same object,
		//    we are required to return true.  The == operator
		//    tests whether they are exactly the same object.
		if (this == obj)
			return true;
		// "this" object cannot be null (or we would have
		//    experienced a null-pointer exception by now), but
		//    obj can be null.  We are required to say the two
		//    objects are not the same if obj is null.
		if (obj == null)
			return false;

		//  The two objects must be Polynomials (or better) to
		//     allow meaningful comparison.
		if (!(obj instanceof Polynomial))
			return false;

		// View the obj reference now as the Polynomial we know
		//   it to be.  This works even if obj is a BetterPolynomial.
		Polynomial other = (Polynomial) obj;

		//
		// If we get here, we have two Polynomial objects,
		//   this and other,
		//   and neither is null.  Eclipse generated code
		//   to make sure that the Polynomial's list references
		//   are non-null, but we can prove they are not null
		//   because the constructor sets them to some object.
		//   I cleaned up that code to make this read better.


		// A LinkedList object is programmed to compare itself
		//   against any other LinkedList object by checking
		//   that the elements in each list agree.

		return this.list.equals(other.list);
	}
	public static void main(String[] args) {
		Polynomial polyOne = new Polynomial();
		Polynomial another = new Polynomial();;
		polyOne.addTerm(1).addTerm(1).addTerm(1).addTerm(1);
		another.addTerm(1).addTerm(1).addTerm(1).addTerm(1);
		System.out.println(polyOne);
		System.out.println(polyOne.evaluate(2));
		System.out.println(polyOne.evaluate(2));


	}

}
