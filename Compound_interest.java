package yuan;

public class Compound_interest {

	public static void main(String args[]) {
		
		int present_value = 154000;
		double interest = 0.028;
		int n = 6;
		double future_value = present_value * Math.pow((1 + interest), n);
		
		System.out.println(future_value);
	}

}
