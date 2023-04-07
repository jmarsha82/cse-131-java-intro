package exercises6;

public class Sum {
	
	public static int sum(int n) {
		if(n <= 0){
			return 0;
		}
		else{
			//recursive call
		return sum(n-1) + n;
		}
	}
	public static void main(String[] args) {
		int ans = sum(2);
		System.out.println("Answer is " + ans);

	}

}
