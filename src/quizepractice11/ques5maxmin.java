package quizepractice11;

public class ques5maxmin {
	
public static void main(String[]args) {
	
	//maximum and minimum elements in an array of integers. Numbers: {5, 2, 8, 1, 9, 23, 7, 12, -8}
	
	int[] numbers = {5, 2, 8, 1, 9, 23, 7, 12, -8};

	int max = numbers[0];
	int min = numbers[0];

	for(int i = 1; i < numbers.length; i++)
	{
	    if(numbers[i] > max)
	    {
	        max = numbers[i];
	    }

	    if(numbers[i] < min)
	    {
	        min = numbers[i];
	    }
	}

	System.out.println("Maximum = " + max);
	System.out.println("Minimum = " + min);
	
	
	
	
	
}

}
