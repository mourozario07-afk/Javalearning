package polymorphism;

public class classB extends classA {
	//child class ClassB
	public static void main(String[]args) {
		classB b= new classB();
		b.methodA();
		
		classA a= new classA();
		a.methodA();
	}
	
	
	
	void methodA() {
		System.out.println("I customized it");
			
		}
	
	
		
		
		
	}
	
	
	
	
	


