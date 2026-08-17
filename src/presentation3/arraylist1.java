package presentation3;

import java.util.ArrayList;

public class arraylist1 {
	public static void main(String[]args) {
		//creat an ArrayList called browsers
		
		ArrayList<String> browsers= new ArrayList<String>();
		
	
		
		
		//add
		browsers.add ("firefox");
		browsers.add ("google");
		browsers.add ("Chrome");
		browsers.add ("safari");
		
		
		//find size
		
		System.out.println("Running Test on "+browsers.size());
		
		//get a browsers
		System.out.println(browsers.get(1));
		
		// remove browsers
		browsers.remove("safari");
		System.out.println(browsers);
		
		//update browsers
		browsers.set(0, "edge");
		System.out.println(browsers);
		
		//check if browser exists
		 System.out.println(browsers.contains("edge"));
		

		
		
		
		
		
	}
	
	
	
	
	

}
