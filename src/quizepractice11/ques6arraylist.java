package quizepractice11;
import java.util.ArrayList;
public class ques6arraylist {
	public static void main(String[]args) {
//Add 10 fruit names to ArrayList.Print all the names.Find how many names are there.Remove 2 fruit names.Print all the names again

		ArrayList<String> fruits = new ArrayList<>();

       fruits.add("apple");
       fruits.add("banana");
       fruits.add("cherry");
       fruits.add("qiwi");
       fruits.add("orange");
       
       System.out.println(fruits);
       
       System.out.println(fruits.size());
       
       fruits.remove("apple");
       fruits.remove("banana");
       System.out.println(fruits);
       System.out.println(fruits.size());



		
		
		
		
		
	}

}
