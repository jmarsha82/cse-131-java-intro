package exercises7;

/**
 * 
 * Identify the parts of this object:
 *      Constructor
 *      Instance variables
 *      Methods
 *         Accessors
 *         Mutators
 *         Other
 *
 */
public class Person {
	
	private int height, age; //Instance variables
	
	public Person(int height) { //Constructor
		this.height = height;
		this.age    = 0;
	}
	
	public void setHeight(int height) { //Mutators
		this.height = height;
	}
	
	public void happyBirthday() {  //Other
		this.age = this.age + 1;
	}
	
	public int getHeight() { //Accessors
		return this.height;
	}
	
	public int getAge() {  //Accessors
		return this.age;
	}
	

}
