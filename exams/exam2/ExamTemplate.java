package exam2;

import java.awt.Color;

import sedgewick.StdDraw;

public class ExamTemplate {
	/**
	 * @param a number of Strings that are being displayed
	 * @param kochString is the String value "F"
	 * @return a sum of Strings in String form
	 */
	public static String koch(int a){
		String kochString = "F";
		if(a==0){return kochString;}
		else if(a==1){
			kochString = kochString.replaceAll("F", "F+F-F-F+F");
			return kochString;
		}
		else{
			kochString = kochString.replaceAll("F", koch(1));
			return kochString + "-" +koch(a-1);
		}
	}	
	/**
	 * 
	 * @param dragonStringOne is String F
	 * @param dragonStringTwo is String H
	 * @return new string
	 */
	public static String dragon(int a){
		String dragonStringOne = "F";
		String dragonStringTwo = "H";
		for(int i=a; i>=a; --i){
			if(i!=0){
				dragonStringOne = dragonStringOne.replaceFirst("F", "F-H");
				dragonStringTwo = dragonStringTwo.replaceFirst("H", "F+H");
				return dragonStringOne + "-" + dragonStringTwo;
			}
		}
		return dragonStringOne + "-" + dragonStringTwo;
	}
	/*
	 * @param count keeps track of the number of letters in the string
	 * @return brings back a calculation as defined by the test
	 */
	public static double computeScale(String lString){
		double count = 0;
		for(int i=0;i<lString.length();++i){
			if(lString.charAt(i)== 'F' || lString.charAt(i)== 'H'){
				count++;
			}
		}
		return 1/(2*Math.sqrt(count));
	}

	public static String drawLString(String lString){
		
		for(int i=0;i<lString.length();++i){
		}
	}

	public static void main(String[] args) {
		//Yes, this is supposed to be blank

		System.out.println(koch(0));
		System.out.println(koch(1));
		System.out.println(koch(2));
		System.out.println(koch(10));
		System.out.println(" ");
		System.out.println(dragon(0));
		System.out.println(dragon(1));
		System.out.println(dragon(2));
		System.out.println(dragon(10));
		System.out.println(computeScale(koch(2)));
		StdDraw.setPenColor(Color.BLACK);
		drawLString(koch(2));
		StdDraw.show(10); 
	}

	//The methods that we ask you to write should go here
}
