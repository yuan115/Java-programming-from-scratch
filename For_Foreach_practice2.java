package yuan;

public class For_Foreach_practice2 {
	
	public static void main(String args[]) {
		
		// Print first line
		System.out.print(" ");
		for(int i = 0; i < 13; i ++) {
			System.out.print( i + " ");
		}
		System.out.println("");
		
		// Print 12 x 12 result
		for(int i = 0; i < 13; i ++){
			System.out.print(i + " ");
			for(int j = 0; j < 13; j ++){
				
				System.out.print(i*j + " ");
			}
			System.out.println("");
		}
					
		
	}

}
