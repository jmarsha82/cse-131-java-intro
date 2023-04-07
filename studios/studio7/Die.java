package studio7;

public class Die {
	
	private int sides;
	
	public Die (int sides){
		this.sides = sides;
	}
	public int numRolled (){
		return (int)(Math.random()*sides)+1;
	}
}
