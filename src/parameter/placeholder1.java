package parameter;

public class placeholder1 {
	public static void main(String[]args) {
		
	placeholder1 p1= new placeholder1();
	p1.sum(10,5);
	p1.name();
	p1.name("Java");
	p1.number (15,10);
	
		
	}

	void sum(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
	void name() {
		System.out.println("Mou");
		
	}
	
	void name(String c) {
		System.out.println("My name is:"+c);
	}
	
	void number (int a, int b ) {
		System.out.println(a>b);
		
	}
	
	
	
}
