import cse131.ArgsProcessor;

public class stringtheory {
	/**
	 * @param input is math function in string form
	 * @param is placeholder for removed strings
	 * @param stores the operator from the function
	 * @param firstNum and secondNum hold the numbers after they are parsed
	 * @param ans is the answer of the function
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String input = ap.nextString("Please input a math problem(+-*/) in this format: \n       # + #");
		String placeHolder = " ";
		int firstNum = 0;
		String operator = " ";
		int secondNum = 0;
		int ans = 0;
		for(int i = 0; i<input.length();++i){
			if(Character.isWhitespace(input.charAt(i))){
				placeHolder = input.substring(0,i);
				firstNum = Integer.parseInt(placeHolder);
				operator = input.substring(i+1,i+2);
				placeHolder = input.substring(i+3,input.length());
				secondNum = Integer.parseInt(placeHolder);
				break;
			}
		}
		if(operator.equals("+")){ans = firstNum + secondNum;}
		if(operator.equals("-")){ans = firstNum - secondNum;}
		if(operator.equals("*")){ans = firstNum * secondNum;}
		if(operator.equals("/")){ans = firstNum / secondNum;}
		System.out.println(firstNum + " " + operator + " " + secondNum + " = " + ans);
	}

}
