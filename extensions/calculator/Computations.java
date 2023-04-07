package calculator;

public class Computations {

	public static double addDoubles(double d1, double d2){
		return d1 + d2;
	}
	public static double subtractDoubles(double d1, double d2){
		return d1 - d2;
	}
	public static double divideDoubles(double d1, double d2){
		if(d2==0){return 0;}
		return d1 / d2;
	}
	public static double multiplyDoubles(double d1, double d2){
		return d1 * d2;
	}
	public static int addInts(int d1, int d2){
		return d1 + d2;
	}
	public static int subtractInts(int d1, int d2){
		return d1 - d2;
	}
	public static int divideInts(int d1, int d2){
		if(d2==0){return 0;}
		return d1 / d2;
	}
	public static int multiplyInts(int d1, int d2){
		return d1 * d2;
	}
	public static String concatenate(String s1, String s2){
		String ans = s1 + s2;
		return ans;
	}
	public static boolean andBoolean(boolean b1, boolean b2){
		if(b1==true && b2==true){return true;}
		else{return false;}
	}
	public static boolean orBoolean(boolean b1, boolean b2){
		if(b1==true || b2==true){return true;}
		else{return false;}
	}
	public static double intToDouble(int in){
		return (double)in;

	}
	public static double doubleToDouble(double in){
		return (double)in;

	}
	public static double stringToDouble(String in){
		throw new UnsupportedOperationException();
	}
	public static double booleanToDouble(boolean in){
		throw new UnsupportedOperationException(); 
	}
	public static int intToInt(int in){
		return (int)in;

	}
	public static int doubleToInt(double in){
		return (int)in;
	}
	public static int stringToInt(String in){
		throw new UnsupportedOperationException();
	}
	public static int booleanToInt(boolean in){
		throw new UnsupportedOperationException();
	}
	public static String intToString(int in){
		String value = String.valueOf(in);
		return value;
	}
	public static String doubleToString(double in){
		String value = String.valueOf(in);
		return value;
	}
	public static String stringToString(String in){
		return in;
	}
	public static String booleanToString(boolean in){
		if(in==true){return "true";}
		else return "false";
	}
	public static boolean intToBoolean(int in){
		throw new UnsupportedOperationException();
	}
	public static boolean doubleToBoolean(double in){
		throw new UnsupportedOperationException();
	}
	public static boolean stringToBoolean(String in){
		throw new UnsupportedOperationException();
	}
	public static boolean booleanToBoolean(boolean in){
		return in;
	}
}









