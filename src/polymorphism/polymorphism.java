package polymorphism;

public class polymorphism {
	
	
	
	
	public static void main(String[]args) {
		
		polymorphism pa= new polymorphism();
		pa.sum(10, 5);
		pa.sum(25.5, 5);
		pa.sum(10,20, 30);
		pa.sum(10.5,20.5, 30.5);
		
		
	}
	
	void sum(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
void sum(double a, int b) {
		
		System.out.println(a+b);
		
	
}
void sum(int a, int b, int c) {
	
	System.out.println(a+b+c);
	

}

void sum(double a, double b, double c) {
	
	System.out.println(a+b+c);
	

}


}
