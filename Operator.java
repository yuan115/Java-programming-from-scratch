package yuan;

public class Operator {
	
	public static void main(String args[]) {
		
		int a = 4;
		int b = 3;
		
		a++;
		b--;		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a%b);
		System.out.println(a == b);
		
		
		String str = "420";
		str += 42;
		
		System.out.println(str);
		
		// Ternary Operator
		// (a > b) ? true:flse
		
		int x = 2;
		int y = 3;
		System.out.println(x<y ? "yes":"no");
		
		int alpha = 3;
		int beta = 4;
		System.out.println((alpha != beta)&&(beta % alpha > 0) ? "yes":"no");
	}

}
