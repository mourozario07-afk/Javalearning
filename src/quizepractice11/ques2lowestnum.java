package quizepractice11;

public class ques2lowestnum {
public static void main(String[]args) {
	//Find the lowest number from 342, - 231, 432, 997, 765,  - 715, 234, 265, 322
	int[] numbers = {342, -231, 432, 997, 765, -715, 234, 265, 322};

	int min = numbers[0];

	for(int i = 1; i < numbers.length; i++)
	{
	    if(numbers[i] < min)
	    {
	        min = numbers[i];
	    }
	}

	System.out.println("Lowest Number = " + min);
	
	
}
	
	
	

}
