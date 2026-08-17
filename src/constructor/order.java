package constructor;

public class order {
	   order(String item) {
	        System.out.println("Amazon Ordered: " + item);
	    }
	

	
	    public static void main(String[] args) {
	        order o1 = new order("Jewellery");
	        order o2 = new order("Laptop");
	    }
	}
