package yuan;

public class Split_Substring {
	
	public static void main(String args[]) {
		
		String str = "id, name, age";
		String[] sArray = str.split(",");
		
		System.out.println(sArray[1].trim());
		
		
		String str2 = "abcdef";
		
		System.out.println(str2.substring(0, 4));
		
	}

}
