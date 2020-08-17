package yuan;

public class While_practice {
	
	public static int stable_heart = 65;
	public static double strength = 0.65;
	
	public static void main(String args[]) {
		
		do { System.out.println("strength: " + strength + ", heartbeat: "
				+ While_practice.heartbeat(22));
			strength += 0.1;
		} while (strength < 0.95);
		
	}
	
	public static double heartbeat(int age) {
		
		return (((220 - age) - stable_heart) * strength) + stable_heart;			
		
	}

}
