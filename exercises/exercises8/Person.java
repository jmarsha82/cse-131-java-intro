package exercises8;

import java.util.LinkedList;
import java.util.List;

public class Person {
	
	final private List<Valuable> assets;
	
	public Person(){
		this.assets = new LinkedList<Valuable>();
	}

	public void addAssests(Valuable v) {
		assets.add(v);
	}
	public List<Valuable> getAssets(){
		return this.assets;
	}
	public int getWorth(){
		int sum = 0;
		for(Valuable v : assets){
			sum = sum + v.getLiquidValue();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.addAssests(new BankAccount(1000));
		StockHolding s = new StockHolding ("IBM", "Ron", 131);
		s.setNumShares(100);
		p.addAssests(s);
		PersonalProperty pp = new PersonalProperty(100000);
		for(int i=0; i<10; ++i) pp.yearOlder();
		System.out.println("Assets " + p.getAssets());
		System.out.println("Person is worth " + p.getWorth());
		
		
	}
	

}
