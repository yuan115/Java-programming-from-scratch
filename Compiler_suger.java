package yuan;

public class Compiler_suger {
	
	public static void main(String args[]) {
		
		// autoboxing		
		double d1 = 3.14;
		Double d2 = d1;
		System.out.println(d2);
		
		// unboxing
		Double d3 = new Double(3.14);
		double d4 = d3;
		System.out.println(d4);
		
	}

}
