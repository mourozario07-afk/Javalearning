package inharited;
//Max> John > Will
//max> marty 
public class marty extends max {
	
	String car3= "Mazda";
	
	double balance3= 235462;
	String house3= "miami";
	String watch= "AP";
	
	void wearingWatch() {
		
		System.out.println(this.watch);
	}
	public static void main(String[]args) {
		
		marty m= new marty();
		m.wearingWatch();
		
		
		
		
	}

}
