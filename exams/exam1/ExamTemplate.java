package exam1;
public class ExamTemplate {

	public static int[] question1() {
		// feel free to modify the declaration of answer as necessary
		int[] answer = new int[10];
		for(int i = 0; i < answer.length; i++){
			if (i <= 2){
				answer[0] = 3;
				answer[1] = 0;
				answer[2] = 2;
			}
			else{	
				int number = answer[i - 2] + answer[i - 3];
				answer[i] = number;
			}
		}
		// don't change the return statement
		return answer;
	}

	public static boolean[] question2() {
		// feel free to modify the declaration of answer as necessary
		int[] perrin = new int [50];
		boolean[] answer = new boolean[50];
				for(int i = 0; i < perrin.length; i++){
					if (i <= 2){
						perrin[0] = 3;
						perrin[1] = 0;
						perrin[2] = 2;
						if(i > 0 && perrin[i] % i == 0){
							answer[i] = true;
						}
						else{
							answer[i] = false;
						}
					}
					else{	
						int number = perrin[i - 2] + perrin[i - 3];
						perrin[i] = number;
						if(perrin[i] % i == 0){
							answer[i] = true;
						}
						else{
							answer[i] = false;
						}
					}
				}

		// don't change the return statement
		return answer;
	}

	public static int question3() {
		// feel free to modify the declaration of answer as necessary
		int answer = 0;
		// you may want to use your answer from question 1 in answering this question
		int[] question1Answer = question1();
		int[] copy = new int [question1Answer.length];
		for(int i = 0; i < copy.length; ++i){
			int sum = copy[i];
			if(sum > 1000){
				answer = sum;
			}
		}
		// don't change the return statement
		return answer;
	}

	public static String[] question4() {
		// feel free to modify the declaration of answer as necessary
		String[] answer = new String[0];

		// you may want to use your answer from questions 1 and 2 in answering this question
		int[] question1Answer = question1();
		boolean[] question2Answer = question2();
		// don't change the return statement
		return answer;
	}

	public static void main(String[] args) {
		/*
		 * NOTE: 
		 * You should not change and should not need to change any of the code below.
		 * It's there just to make it easy for you to see and verify the accuracy of
		 * your answers.
		 */
		int[] question1Answer = question1();
		boolean[] question2Answer = question2();
		int question3Answer = question3();
		String[] question4Answer = question4();

		// print all of the answers
		System.out.println("QUESTION 1 ");
		for (int i = 0; i < question1Answer.length; i++) {
			System.out.print( question1Answer[i] + ", ");
		}
		System.out.println();
		System.out.println();

		// print the i's where the value is TRUE
		System.out.println("QUESTION 2 ");
		for (int i = 0; i < question2Answer.length; i++) {
			if (question2Answer[i] == true) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		System.out.println();

		System.out.println("QUESTION 3: " + question3Answer);
		System.out.println();
		System.out.println();


		// print out all answers
		System.out.println("QUESTION 4 ");
		for (int i = 0; i < question4Answer.length; i++) {
			System.out.println(question4Answer[i]);
		}

	}

}