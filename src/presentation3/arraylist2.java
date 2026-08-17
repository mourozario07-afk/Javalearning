package presentation3;

import java.util.ArrayList;


public class arraylist2 {
	public static void main(String[]args) {
		//list of flowers
		
		ArrayList<String>flowers = new ArrayList<String>();
		
		flowers.add("Rose");
		flowers.add("Jasmin");
		flowers.add("Daisy");
		
		System.out.println(flowers.size());
		
		System.out.println(flowers.get(0));
		
		flowers.remove(0);
		System.out.println(flowers);
		
		flowers.set(0,"tulip");
		System.out.println(flowers);
		
		System.out.println(flowers.contains("tulip"));
		

        for(int i=0; i<flowers.size(); i++)
        {
            System.out.println(flowers.get(i));
        }
		
		
		
		
		
		
		
		
		
		
	}

}
