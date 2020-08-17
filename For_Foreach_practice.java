package yuan;

public class For_Foreach_practice {

	public static void main(String args[]) {
		int[] array = {3, 10, 18, 24};
		
		System.out.println(For(array));
		System.out.println(Foreach(array));
	}
	
	
	public static int For(int[] array) {
		int temp = 0;
		for(int i = 0; i < array.length; i ++) {
			temp += array[i];
		}
		return temp;
	}
	
	
	public static int Foreach(int[] array) {
		int temp = 0;		
		for(int i : array) {
			temp += i;
		}
		return temp;
	}	
}
