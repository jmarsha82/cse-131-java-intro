package codingBat;

import java.util.Arrays;

public class CodingBatArrayOne {

	public static boolean firstLast6(int[] a) {
		int first = a[0];
		int second = a[a.length-1];
		if(first==6 || second==6){
			return true;
		}
		return false;
	}

	public static boolean sameFirstLast(int[] b) {
		if(b.length==0){return false;}
		int first = b[0];
		int second = b[b.length-1];
		if(first==second){
			return true;
		}
		return false;
	}

	public static int[] makePi(int [] c) {
		int [] pie = new int[c.length];
			return pie;
		}

	public static boolean commonEnd(int[] a, int[] b) {
		if(a.length==0){return false;}
		if(b.length==0){return false;}
		int firstA = a[0];
		int secondA = a[a.length-1];
		int firstB = b[0];
		int secondB = b[b.length-1];
		if(firstA==firstB || secondB==secondA){
			return true;
		}
		  return false;
	}
	
	public static int sum3(int[] nums) {
		int sum = nums[0] + nums[1] + nums[2];
		return sum;	  
	}

		public static void main(String[] args) {
			int[] a = {13, 6, 1, 2, 6};
			int[] b = {1, 2, 3, 1};
			int[] c = {3,1,4};
			makePi(c);
			System.out.println("Answer for firstLast6 is: " + firstLast6(a));
			System.out.println("Answer for sameFirstLast is: " + sameFirstLast(b));
			System.out.println("Answer for makePi is: " + Arrays.toString(c));
			System.out.println("Answer for commonEnd is: " + commonEnd(a,b));
			System.out.println("Answer for sum3 is: " + sum3(c));
			// TODO Auto-generated method stub

		}

	}
