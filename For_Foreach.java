package yuan;

public class For_Foreach {
	
	public static void main(String args[]) {
		
		for(int i = 0; i < 11; i ++) {
			System.out.println(i);
		}
		
		for(int i = 0; i < 10; i ++) {			
			for(int j = 0; j < 10; j ++) {				
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
		

		int[] array = {1, 2, 3};
//		for(int i = 0; i < array.length; i ++) {
//			System.out.println(array[i]);
//		}
		for(int m : array) {
			System.out.println(m);
		}
	}

}
