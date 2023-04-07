package exercises8;

public class PersonalProperty implements Valuable {
	
	private final int intialValue;
	private int yearsOld;

	public PersonalProperty(int intialValue) {
		this.intialValue = intialValue;
	}
	
	public int depreciatedValue(){
		//intial value * .80 raised to the yearsOld power
		return (int)(this.intialValue * Math.pow(.80, yearsOld));
	}

	public void yearOlder(){
		this.yearsOld = this.yearsOld + 1;
	}

	public String toString(){
		return "Intial Value: "+ this.intialValue + " current value " + this.depreciatedValue();
	}
	
	@Override
	public int getLiquidValue() {
		// TODO Auto-generated method stub
		return this.depreciatedValue();
	}

}
