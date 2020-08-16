package yuan;

public class indexOf_lastIndexOf_contains {
	
	public static void main(String[] args) {
		
		String str = "aabbccddeeff";
		System.out.println(str.indexOf("b"));
		System.out.println(str.lastIndexOf("b"));
		
		System.out.println(str.substring(str.indexOf("b"), str.lastIndexOf("c") + 1));
		
		System.out.println(str.contains("g"));
		
	}
	
}
