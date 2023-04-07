package codingBat;

import java.util.Arrays;

public class CodingBatWarmUpTwo {

	 

    /**

    * @param str some string of characters

    * @param n some number

    * @return newString which is a copy of the original for number of times n

    */

    public static String stringTimes(String str, int n){

          String newString = "";

          for(int i=0; i<n; i++){

                 newString += str;

          }

          return newString;

    }



    /**

    * @param str some string of characters

    * @param n some number

    * @return

    */

    public static String frontTimes(String str, int n) {

          String frontThree = "";

          String newString="";

          int j = str.length();

          if(j>3){

                 frontThree = str.substring(0,3);

          }

          else{frontThree = str;}

          for(int i=0;i<n;++i){

                 newString += frontThree; 

          }

          return newString;

    }

    /**

    * @param str some string of characters

    * @return a count based on the number of times you see "xx"

    */

    public static int countXX(String str) {

          int count=0;

          for(int i=0; i<str.length()-1;++i){

                 if (str.substring(i, i+2).equals("xx")) count++;

          }

          return count;

    }

    /**

    * @param str some string of characters

    * @return true or false based off if you see "xx" anywhere in the string

    */

    public static boolean doubleX(String str) {

          int count=0;

          for(int i=0; i<str.length()-1;++i){

                 if (str.substring(i, i+2).equals("xx")) count++;

          }

          if(count > 0){

                 return true;

          }

          else{

                 return false;

          }

    }

    /**

    * @param str some string of characters

    * @return a string that is made up of every other character

    */

    public static String stringBits(String str) {

          String newString = "";

          for(int i=0; i<str.length();i+=2){

                 newString+=str.substring(i,i+1);

          }

          return newString;            

    }

    /**

    * @param str some string of characters

    * @returns a string that is made up of the n then n, n+1 then n,n+1,n+2... etc

    */

    public static String stringSplosion(String str) {

          String newString = "";

          for(int i=0;i<str.length();++i){

                 newString+=str.substring(i-i,i+1);

          }

          return newString;

    }

    /**

    * @param str some string of characters

    * @return the number of times the last two characters appear in the string excluding

    * the last two characters

    */

    public static int last2(String str) {

          if (str.length() < 2) return 0;           

          String end = str.substring(str.length()-2);

          int count = 0;               

          for (int i=0; i<str.length()-2; i++) {

                 String sub = str.substring(i, i+2);

                 if (sub.equals(end)) {

                        count++;

                 }

          }

          return count;

    }

    /**

    * @param a some in going into an array

    * @param b some in going into an array

    * @param c some in going into an array

    * @param d some in going into an array

    * @param e some in going into an array

    * @return the number of "9" that is in the array

    */

    public static int arrayCount9(int a, int b, int c, int d, int e) {

          int [] nums = {a,b,c,d,e};

          int count = 0;

          for(int i=0;i<nums.length;++i){

                 if(nums[i] == 9){

                        count++;

                 }

          }

          return count;         

    }



    /**

    * @param a some in going into an array

    * @param b some in going into an array

    * @param c some in going into an array

    * @param d some in going into an array

    * @param e some in going into an array

    * @return true if one of the first 4 characters are 9

    */

    public static boolean arrayFront9(int a, int b, int c, int d, int e) {

          int [] nums = {a,b,c,d,e};

          int count = 0;

          for(int i=0;i<nums.length-1;++i){

                 if(nums[i] == 9){count++;}

          }

          if(count>0){return true;}

          else{return false;}

    }



    /**

    * @param a some in going into an array

    * @param b some in going into an array

    * @param c some in going into an array

    * @param d some in going into an array

    * @param e some in going into an array

    * @return true if the sequence 1,2,3 shows in the array

    */

    public static boolean array123(int a, int b, int c, int d, int e) {

          int [] nums = {a,b,c,d,e};

          int count = 0;

          for(int i=0;i<nums.length-2;++i){

                 int one = nums[i];

                 int two = nums[i+1];

                 int three = nums[i+2];

                 if(one==1 && two==2 && three==3){

                        count++;

                 }

          }

          if(count>0){

                 return true;

          }

          else{

                 return false;

          }

    }

    /**

    * @param a some string of characters

    * @param b some string of characters

    * @return number of positions where they contain the same two characters

    */

    public static int stringMatch(String a, String b) {

          int len = Math.min(a.length(), b.length()); //determines which string is shorter

          int count = 0;

          for (int i=0; i<len-1; i++) {

                 String aSub = a.substring(i, i+2);

                 String bSub = b.substring(i, i+2);

                 if (aSub.equals(bSub)) {

                        count++;

                 }

          }

          return count;

    }

    /**

    * @param str some string of characters

    * @return a string where x has been removed from all characters except

    * the last and first

    */

    public static String stringX(String str) {

          String result = "";

          for (int i=0; i<str.length(); i++) {

                 if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {

                        result = result + str.substring(i, i+1); // Could use str.charAt(i) here

                 }

          }

          return result;

    }

    /**

    * @param str some string of characters

    * @return a string at 0,1, 4,5, 8,9... etc

    */

    public static String altPairs(String str) {

          String result = "";

          for (int i=0; i<str.length(); i += 4) {

                 int end = i + 2;

                 if (end > str.length()) {

                        end = str.length();

                 }

                 result = result + str.substring(i, end);

          }

          return result;

    }      



    /**

    * @param str some string of characters

    * @return a string where "yak" has been removed

    */

    public static String stringYak(String str) {

          String newString = "";

          for (int i=0; i<str.length(); i++) {

                 if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {

                        i =  i + 2;

                 } else {

                        newString = newString + str.charAt(i);

                 }

          }

          return newString;

    }



    /**

    * @param a some in going into an array

    * @param b some in going into an array

    * @param c some in going into an array

    * @param d some in going into an array

    * @return a count the number of times that the array has "66" or "67"

    */

    public static int array667(int a, int b, int c, int d) {

          int [] nums = {a,b,c,d};

          int count = 0;

          for(int i=0; i<nums.length-1;i++){

                 if(nums[i]==6 && nums[i+1]==6 || nums[i]==7){

                        count++;

                 }

          }

          return count;

    }

    public static boolean noTriples(int [] a) {

            for (int i=0; i < (a.length-2); i++) {

              int first = a[i];

              if (a[i+1]==first && a[i+2]==first) return false;

            }

            return true;

          }

    

    public static boolean has271(int[] b) {

            for (int i=0; i < (b.length-2); i++) {

              int val = b[i];

              if (b[i+1] == (val + 5) &&

                Math.abs(b[i+2] - (val-1)) <= 2)  return true;

            }

            return false;

          }

    public static void main(String[] args) {

          int[] a = {1,1,1,2,2,2,1};

          int[] b = {1,1,1,2,2,2,1};

          

          System.out.println(stringTimes("Fuck ",5));

          System.out.println(frontTimes("Chicken", 5));

          System.out.println(countXX("xxxx"));

          System.out.println(doubleX("xxxxx"));

          System.out.println(stringBits("Heeololeo"));

          System.out.println(stringSplosion("abc"));

          System.out.println(last2("hixxhi"));

          System.out.println(arrayCount9(1,9,9,3,9));

          System.out.println(arrayFront9(1,2,3,4,9));

          System.out.println(array123(1,2,3,1,1));

          System.out.println(stringMatch("xxcaazz", "xxbaaz") );

          System.out.println(stringX("xxHxix") );

          System.out.println(altPairs("Chocolate") );

          System.out.println(stringYak("pakyak"));

          System.out.println(array667(6,6,2,6));

          noTriples(a);

          System.out.println(Arrays.toString(a));

          has271(b);

          System.out.println(Arrays.toString(b));

    }

}

