package quizepractice11;

public class ques3sum {
	public static void main(String[]args) {
		
	//Add all the numbers and print sum of 342, - 231, 432, 997, 765,  - 715, 234, 265, 322
		
		int[] numbers = {342, -231, 432, 997, 765, -715, 234, 265, 322};

		int sum = 0;

		for(int i = 0; i < numbers.length; i++)
		{
		    sum = sum + numbers[i];
		}

		System.out.println("Sum = " + sum);
		
		
		
		
		
	}

}
