package yuan;

public class types_exercise {
	
	public static void main(String args[]) {
		
		// part1
		double d = 3.14;
		String s = String.valueOf(d);
		float f = Float.parseFloat(s);
		
		//part2
		Float f2 = new Float(f);
		int i = f2.intValue();
		System.out.print(i);
		
	}

}
