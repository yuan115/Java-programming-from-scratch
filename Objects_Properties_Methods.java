package yuan;

public class Objects_Properties_Methods {
	
	public static void main(String args[]) {
		
		// Wrapper Types
		Double d = new Double(3.14);
		System.out.println(d.SIZE);   
		System.out.println(d.intValue());
		
		
		// valueOf
		double d1 = 3.14;
		Double d2 = Double.valueOf(d1);
		System.out.println(d2);
		
	}

}