package studio7;

public class Complex {

	private double real;
	private double imaginary;
	
	public Complex (double initialReal, double initialImaginary){
		this.real = initialReal;
		this.imaginary = initialImaginary;
	}
	
	public double getReal (){
		return real;
	}
	
	public double getImaginary (){
		return imaginary;
	}
	
	public Complex addComplex (Complex x){
		double newReal = real+x.getReal();
		double newImag = imaginary+x.getImaginary();
		return new Complex (newReal, newImag);
	}
	
	public Complex multComplex (Complex x){
		double newReal = real*x.getReal()-imaginary*x.getImaginary();
		double newImag = real*x.getImaginary() + imaginary*x.getReal();
		return new Complex (newReal, newImag);
	}
	
	public String getCompNum (){
		return real + "+" + imaginary +"i";
	}
}
