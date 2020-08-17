package yuan;

public class method_BMI {
	
	public static void main(String[] args) {
		
		method_BMI demo = new method_BMI();
		System.out.println(demo.BMI(1.77, 68));
		
	}

	
	
	public double BMI(double height, double weight) {
		
		double result = weight / Math.pow(height, 2);
		return result;
	}
	
}
