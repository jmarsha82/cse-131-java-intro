package studio7;

public class Fraction {

	private int numerator;
	private int denominator;

	public Fraction (int n, int d){
		this.numerator = n;
		this.denominator = d;
	}
	
	public int getNumerator (){
		return numerator;
	}
	
	public int getDenominator (){
		return denominator;
	}
	
	public Fraction addFraction (Fraction x){
		int newNum = numerator;
		int newDen = denominator;
		if (denominator == x.getDenominator()){
			newNum += x.getNumerator();
		}
		else {
			newDen = newDen*x.getDenominator();
			newNum = numerator*x.getDenominator() + x.getNumerator()*denominator;
		}
		return new Fraction(newNum, newDen);
	}
	
	public Fraction multFractions (Fraction x){
		int newNum = numerator*x.getNumerator();
		int newDen = denominator*x.getDenominator();
		return new Fraction (newNum, newDen);
	}
	
	public Fraction inverse (){
		int newNum = denominator;
		int newDen = numerator;
		return new Fraction (newNum, newDen);
	}
	
	public Fraction simplify (){
		int newNum = numerator;
		int newDen = denominator;
		for (int i = denominator; i >= 1; --i){
			if (newDen%i == 0 && newNum%i == 0){
				newNum = newNum/i;
				newDen = newDen/i;
			}
		}
		return new Fraction (newNum, newDen);
	}
}
