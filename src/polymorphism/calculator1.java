package polymorphism;

public class calculator1 {
	//sum up to 2 numbers
	// sum 3 numbers
	// polymorphism-> overriding, overloding;
	// Overloading - same class, different parameter
	// overriding- cild class, different body/ implementation
	public static void main(String[]args) {
		calculator1 ca= new calculator1();	
		ca.sum(5, 10);
		ca.sum(25.5, 20);
		ca.sum(10.5, 10);
		ca.sum(5, 10,20);
		
		
	}
	void sum(int a,int b) {
		
		int sum=a+b;
	System.out.println(a+b);
	}
	void sum(double a, double b) {
		double sum=a+b;
		System.out.println(a+b);
		
	}
	
void sum(double a,int b) {
		
		double sum=a+b;
	System.out.println(a+b);

}
void sum(double a, double b, double c) {
	
	double sum=a+b+c;
	
	System.out.println(a+b+c);}
}

	
	

