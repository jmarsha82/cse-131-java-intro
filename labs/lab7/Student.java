package lab7;

public class Student {

	/**
	 * instance variables
	 */
	private String name;
	private int studentID, credits;
	private double GPA;
	/**
	 * 
	 * @param firstName is the first name of the student
	 * @param lastName is the last name of the student
	 * @param studentID is the id of the student
	 */
	public Student(String firstName, String lastName, int studentID) { //Constructor
		this.name = firstName + " " + lastName;
		this.studentID= studentID;
		this.credits = 0;
		this.GPA = 0.0;
	}
	/**
	 * @param sets the name of the student
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param sets the credits of the student
	 */	
	public void setCredits(int credits) {
		this.credits = credits;
	}
	/**
	 * @param set the ID of the student
	 */
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	/**
	 * @returns the name of the student
	 */
	public String getName() {
		return name;
	}
	/**
	 * @returns the ID of the student
	 */
	public int getStudentID() {
		return studentID;
	}
	/**
	 * @returns the credits of the student
	 */
	public int getCredits(){
		return credits;
	}
	/**
	 * calculates a class standing
	 * @returns freshman, sophomore, junior or senior depending on the credits
	 */
	public String getClassStanding(){ //Getter
		if(this.credits >= 90){return "Senior";}
		else if(this.credits >= 60 && this.credits < 90){return "Junior";}
		else if(this.credits >= 30 && this.credits < 60){return "Sophomore";}
		else{return "Freshman";}
	}
	/**
	 * @param set the GPA of the student
	 */
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	/**
	 * @returns the GPA of the student
	 */
	public double getGPA() {
		return GPA;
	}
	/**
	 * @param Parent is one of the parents of the child
	 * @return a Student object of the child
	 */
	public Student createLegacy(Student Parent){
		Student junior = new Student(" ", " ", 0);
		junior.name = Parent.name + " " + this.getName();
		junior.studentID = Parent.studentID + getStudentID();
		junior.GPA = (Parent.GPA + getGPA()) / 2;
		if(Parent.credits > getCredits()){junior.credits = Parent.credits;}
		else{junior.credits = getCredits();}

		return junior;
	}
	/**
	 * @returns name and id of student
	 */
	public String toString(){
		String newName = getName();
		int newStudentID = getStudentID();
		String toString = newName +  newStudentID;
		return toString;
	}
	/**
	 * submits a grade for a course
	 * @param courseGrade is the grade achieved in teh course
	 * @param credits is the credits for the course
	 */
	public void submitGrade(double courseGrade, int credits){


		double currentQS = this.credits * this.GPA;
		double courseQS = courseGrade * credits;
		double newQS = currentQS + courseQS;

		double newGPA = Math.round((newQS / (this.credits + credits))*1000) / 1000.0;
		this.credits += credits;
		this.GPA = newGPA;
	}


	public static void main(String[] args) {

	}


}
