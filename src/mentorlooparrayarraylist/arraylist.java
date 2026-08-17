package mentorlooparrayarraylist;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[]args) {
		//Create an Empty ArrayList
		//add fruits
		//size or total fruits
		//get fruits
		//remove fruits
		//update fruits
		//check or contain fruits
		
	
		
		ArrayList<String> fruits= new ArrayList<String>();
		
		
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Grapes");
		System.out.println(fruits);
		
		System.out.println(fruits.size());
		System.out.println(fruits.get(1));
		
		fruits.remove("Banana");
		System.out.println(fruits);
		
		fruits.add("Apple");
		fruits.add("Peach");
		System.out.println(fruits);
		
		System.out.println(fruits.contains("Banana"));
		
		System.out.println(fruits.contains("Apple"));
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
