package quizepractice11;

public class ques4odd {
	public static void main(String[]args) {
		
		//Print odd numbers from 342, - 231, 432, 997, 765,  - 715, 234, 265, 322
		
		int[] numbers = {342, -231, 432, 997, 765, -715, 234, 265, 322};

		for(int i = 0; i < numbers.length; i++)
		{
		    if(numbers[i] % 2 != 0)
		    {
		        System.out.println(numbers[i]);
		    }
		}	
		
		
	}
	
	
	
	

}
