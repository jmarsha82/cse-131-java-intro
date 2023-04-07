package exercises8;

public class BankAccount implements Valuable {

	private int balance;
	
	public BankAccount(int intialBal){
		this.balance = intialBal;
	}
	
	public int getBalance(){
		return this.balance;
	}
	
	public void deposit(int funds){
		this.balance = this.balance + funds;
		this.balance = this.balance - 1;
	}
	@Override
	public int getLiquidValue() {
		return this.getBalance();
	}

}
