package lab7;

public class Course {

	/**
	 * Instance Variables
	 */
	private String name;
	private Student[] roster;
	private int credits;
	private int remainingSeats;
/**
 * creates a course object
 * @param name of the course
 * @param credits is the credits for the course
 * @param remainingSeats is the seats left in the course
 */
	public Course(String name, int credits, int remainingSeats) { // Constructor
		this.name = name;
		this.credits= credits;
		this.remainingSeats = remainingSeats;
		this.roster = new Student [remainingSeats];
	}
/**
 * adds a student to the course
 * @param s is a student object
 * @return boolean based off if the student was added correctly
 */
	public boolean addStudent(Student s){
		for(int i=0; i<roster.length;++i){
			if(roster[i] == s || remainingSeats == 0){
				return false;
			}
////			else{
//				this.roster[i] = s;
//			}		
		}
		this.remainingSeats = this.remainingSeats - 1;
		this.roster[this.remainingSeats] = s;
		return true;
	}
	/**
	 * @param String classRoster is a string of the students in the course
	 * @return the roster
	 */
	public String generateRoster(){
		String classRoster = " ";
		for(int i=0; i<roster.length; ++i){
			classRoster += roster[i]; 
		}
		return classRoster;
	}
	/**
	 * @param totalGPA keeps track of all the GPAs added together
	 * @param seats keeps track of the seating
	 * @return average GPA based off a loop
	 */
	public double averageGPA(){
		double totalGPA = 0;
		int seats = 0;
		for(int i=this.remainingSeats; i<roster.length; ++i){
			totalGPA += roster[i].getGPA();
			seats = seats + 1;
		}
		double averageGPA = totalGPA/seats;
		return averageGPA;
		
	}
	
/**
 * @param String newName creates a string of the name and the studentID
 * @return the string
 */
	public String toString(){
		String newName = getName();
		int newStudentID = getCredits();
		String toString = newName +  newStudentID;
		return toString;
	}
	//should contain the course number and credits 
/**
 * @return remaining seats
 */
	public int getRemainingSeats() {
		return remainingSeats;
	}
/**
 * @param remainingSeats
 */
	public void setRemainingSeats(int remainingSeats) {
		this.remainingSeats = remainingSeats;
	}
/**
 * @return Name of course
 */
	public String getName() {
		return name;
	}
/**
 * @return student roster in array form
 */
	public Student[] getRoster() {
		return roster;
	}
/**
 * @param sets roster
 */
	public void setRoster(Student[] roster) {
		this.roster = roster;
	}
	/**
	 * @param sets name
	 */
	public void setName(String name) {
		this.name = name;
	}
/**
 * @return credits
 */
	public int getCredits() {
		return credits;
	}
	/**
	 * @param sets credits
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
