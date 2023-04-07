package codingBat;

public class CodingBatWarmUpOne {

    /**

    * sleepIn Method from CodingBat

    * @param weekday:  If it is not a weekday OR

    * @param vacation: We are on vacation

    * @return: Then we are sleeping in.

    */

    public static boolean sleepIn(boolean weekday, boolean vacation) {

          if (!weekday || vacation) {

                 return true;

          }

          return false;

    }

    /**

    * monkeyTrouble Method from CodingBat

    * @param aSmile one Monkeys smile

    * @param bSmile other Monkeys smile

    * @return true if both or smiling or both or not, otherwise returns false

    */



    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

          if(aSmile && bSmile || !aSmile && !bSmile){

                 return true;

          }

          else

                 return false;

    }



    /**

    * @param a some integer

    * @param b some integer

    * @return sum of integer or sum *2

    */

    public static int sumDouble(int a, int b) {

          int sumTwo= a+b;

          if(a!=b){

                 return sumTwo;

          }

          else{

                 return sumTwo*2;

          }

    }

    /**

    * @param n an integer

    * @return absolute difference or absolute difference *2

    */

    public static int diff21(int n) {

          if(n>21){

                 return (n-21)*2;

          }

          else{

                 return 21-n;

          }

    }

    /**

    * @param talking is the parrot talking or not

    * @param hour of the day

    * @return boolean if we are in trouble

    */

    public static boolean parrotTrouble(boolean talking, int hour) {

          if(talking && hour<7 || hour>20){

                 return true;

          }

          else{

                 return false;

          }

    }

    /**

    * @param a some number

    * @param b some number

    * @return true or false base on the sum or if they are both 10

    */

    public static boolean makes10(int a, int b) {

          if(a==10||b==10){

                 return true;

          }

          else if(a+b==10){

                 return true;

          }

          else{

                 return false;

          }              

    }

    /**

    * @param n some number

    * @return true or false depending on the conditions

    */

    public static boolean nearHundred(int n) {

          int oneHundred = Math.abs(100-n);

          int twoHundred = Math.abs(200-n);

          if(oneHundred<=10 || twoHundred<=10){

                 return true;

          }

          else

                 return false;

    }

    /**

    * @param a some positive or negative int

    * @param b some positive or negative int

    * @param negative boolean

    * @return boolean

    */

    public static boolean posNeg(int a, int b, boolean negative) {

          if(negative){

                 return (a<0 && b<0);

          }

          else{ return (a<0 && b>0 || a>0 && b<0);

          }

    }

    /**

    * @param str some String

    * @return String with the word not added to the 

     * front of it unless the word not is already there

    */

    public static String notString(String str) {

          if(str.length() >= 3 && str.substring(0, 3).equals("not")) {

                 return str;

          }

          else{

                 return "not " + str;

          }        

    }

    /**

    * @param str a string

    * @param n the index of the string that you are going to remove

    * @return the string with the point n in the index removed

    * remember that the index starts at 0

    */

    public static String missingChar(String str, int n) {

          String front = str.substring(0, n);// creates a string from the beginning to index n

          String back = str.substring(n+1, str.length());//starts str at index after n and goes till end



          return front + back;// adds the two substrings back together

    }

    /**

    * @param str a String variable

    * @param mid a String variable that is made up of the String not including the first and last character

    * @return new String where the first and last character are switched unless the original str input is one letter

    */

    public static String frontBack(String str){

          if (str.length() <= 1){//if the string is only one character just return the string

                 return str;

          }

          else{

                 String mid = str.substring(1, str.length()-1);//assigns the middle of the string to a String variable

                 return str.charAt(str.length()-1) + mid + str.charAt(0);//takes the last character + the mid String variable + the first character

          }

    }

    /**

    * @param str some string

    * @return if the word is 3 or less characters it repeats three times

    * else only characters 1 through 3 of that string are returned

    * three time

    */

    public static String front3(String str) {

          if(str.length() <=3){

                 return str+str+str;

          }

          else{

                 String threeStr = str.substring(0,3);

                 return threeStr + threeStr + threeStr;

          }  

    }

    /**

    * @param str some String of characters

    * @return the original string with the last letter added to the front and back

    */

    public static String backAround(String str){

          int n = str.length();

          String backLetter = str.substring(n-1);

          return backLetter + str + backLetter;

    }



    /**

    * @param n an integer

    * @return true if int is divisable by 3 or 5

    */

    public static boolean or35(int n) {

          if(n%3==0 || n%5==0){

                 return true;

          }

          else{

                 return false;

          }

    }

    /**

    * @param str some String of characters

    * @return str with the first two characters at the beginning and end

    * if the str is less than two characters, just use what is given

    */

    public static String front22(String str) {

          if(str.length() < 2){

                 return str+str+str;

          }

          else{

                 return str.substring(0,2)+str+str.substring(0,2);

          }

    }

    /**

    * @param str

    * @return true if the str is longer than two characters and the first two

    * characters are hi

    * else return false

    */

    public static boolean startHi(String str) {

          if(str.length() < 2){

                 return false;

          }

          String firstTwo = str.substring(0,2);

          if(firstTwo.equals("hi")){

                 return true;

          }

          else{

                 return false;

          }        

    }

    /**

    * @param temp1 one postive or negative int

    * @param temp2 one postive or negative int

    * @return true if the temps are outside the range 0 and 100

    * else return false

    */

    public static boolean icyHot(int temp1, int temp2) {

          if((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)){

                 return true;

          }

          else{

                 return false;

          }

    }

    /**

    * @param a some int

    * @param b some int

    * @return boolean

    */

    public static boolean in1020(int a, int b) {
    	

          return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));

    }

    /**

    * @param a some number

    * @param b some number

    * @param c some number

    * @return true if a b or c are teens, false if none are

    */

    public static boolean hasTeen(int a, int b, int c) {

          if((a<20 && a>10) || (b<20 && b>10) ||(c<20 && c>10)){

                 return true;

          }

          else{

                 return false;

          }

    }

    /**

    * @param a some number

    * @param b some number

    * @return true if a or b is between 13 and 19 but not both

    */

    public static boolean loneTeen(int a, int b) {

          boolean aTeen = (a >= 13 && a <= 19);

          boolean bTeen = (b >= 13 && b <= 19);

          return (aTeen && !bTeen) || (!aTeen && bTeen);

    }

    /**

    * @param str some String of characters

    * @return a str that has the word del removed from the center

    * unless it is not there, then it just returns the String

    */

    public static String delDel(String str) {

          int n = str.length();

          String midDel = str.substring(1,4);

          if(midDel.equals("del")){

                 return str.substring(0,1) + str.substring(4,n);

          }

          else{

                 return str;

          }

    }

    /**

    * @param str some String of characters

    * @return true if the 2nd and 3rd characters are "ix"

    * if not return false

    */

    public static boolean mixStart(String str){

          int n = str.length();

          String firstThree = str.substring(1,3);

          if(firstThree.equals("ix")){

                 return true;

          }

          else{

                 return false;

          }

    }

    /**

    * @param str some String of characters

    * @return if the first letter is o, second is z or first and second are oz then 

     * just return that portion

    */

    public static String startOz(String str) {

          String firstOne = str.substring(0,1);

          String secondOne = str.substring(1,2);

          String firstTwo = str.substring(0,2);

          if(firstTwo.equals("oz")){

                 return firstTwo;

          }

          else if(secondOne.equals("z")){

                 return secondOne;

          }

          else if(firstOne.equals("o")){

                 return firstOne;

          }

          else{

                 return "Nothing";

          }

    }

    /**

    * @param a some number

    * @param b some number

    * @param c some number

    * @return max value

    */

    public static int intMax(int a, int b, int c) {

          int d;

          if(a>b){

                 d=a;

          }

          else{

                 d=b;

          }

          if(c>d){

                 d=c;

          }

          return d;

    }

    /**

    * @param a some number

    * @param b some number

    * @returns whichever one is closer to 10

    */

    public static int close10(int a, int b) {

          int closeA = Math.abs(a-10);

          int closeB = Math.abs(b-10);

          if(closeA<closeB){

                 return a;

          }

          if(closeB<closeA){

                 return b;

          }

          return 0;

    }

    /**

    * @param a some number

    * @param b some number

    * @return true if either a or b are between 30 and 50

    */

    public static boolean in3050(int a, int b) {

          if((a >= 30 && a <= 40) && (a >= 40 && a <= 50)){

                 return true;

          };

          if((b >= 30 && b <= 40) && (b >= 40 && b <= 50)){

                 return true;

          };

          return false;

    }

    /**

    * @param a some number

    * @param b some bumber

    * @return a if it is between 10 and 20 and greater than b, vice versa for b

    */

    public static int max1020(int a, int b) {

          if(a>10 && a<20 && a>b){

                 return a;

          }

          if(b>10 && b<20 && b>a){

                 return b;

          }

          return 0;             

    }

    /**

    * @param str some String of characters

    * @return true if there between 1 and 3 "e" in the word

    */

    public static boolean stringE(String str) {

          int count = 0;

          for (int i=0; i<str.length(); i++) {

                 if (str.charAt(i) == 'e') count++;

          }

          return (count >= 1 && count <= 3);

    }

    /**

    * @param a some number

    * @param b some number

    * @return true if they both end in the same number

    */

    public static boolean lastDigit(int a, int b) {

          return(a % 10 == b % 10);

    }

    /**

    * @param str some String of characters

    * @return all upper case if it is less than 3 characters

    * else return the string with the last three characters capitalized

    */

    public static String endUp(String str) {

          int n = str.length();

          if(n < 3){

                 return str.toUpperCase();

          }

          else{

                 String firstPart = str.substring(0,n-3);

                 String str1 = str.substring(n-3,n);

                 return firstPart + str1.toUpperCase();

          }

    }

    /**

    * @param str some String of characters

    * @param n some number

    * @return creates a new string made of up the nth character from 0 to the end

    * of the word

    */

    public static String everyNth(String str, int n) {

          String newWord = "";

            for(int i = 0; i<str.length();i+=n){

                   newWord += str.charAt(i);

            }

            return newWord;

    }

    public static void main(String[] args) {

          System.out.println(sleepIn(false,true));

          System.out.println(monkeyTrouble(false,true));

          System.out.println(sumDouble(2,2));

          System.out.println(diff21(15));

          System.out.println(parrotTrouble(true, 7));

          System.out.println(makes10(9, 1));

          System.out.println(nearHundred(109));

          System.out.println(posNeg(-4, -5, true));

          System.out.println(notString("not bad"));

          System.out.println(missingChar("kitten", 1));

          System.out.println(frontBack("code"));

          System.out.println(front3("abc"));

          System.out.println(backAround("a"));

          System.out.println(or35(17));

          System.out.println(front22("kitten"));

          System.out.println(startHi("h"));

          System.out.println(icyHot(2, 120));

          System.out.println(in1020(21, 12));

          System.out.println(hasTeen(12, 19, 10));

          System.out.println(loneTeen(21, 19));

          System.out.println(delDel("adelHello"));

          System.out.println(mixStart("pix snacks"));

          System.out.println(startOz("oxx"));

          System.out.println(intMax(1, 2, 3));

          System.out.println(close10(13, 7));

          System.out.println(in3050(40, 50));

          System.out.println(max1020(9, 11));

          System.out.println(stringE("meelee"));

          System.out.println(lastDigit(7, 17));

          System.out.println(endUp("Hello"));

          System.out.println(everyNth("Miracle", 2));

    }

}

