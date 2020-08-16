package yuan;

public class replace_repalceAll {
	
	public static void main(String args[]) {
		
		String str = "abcdABCD123";
		System.out.println(str.replace("a", "f"));
		
		/* Regular Expression */
		System.out.println(str.replaceAll("\\d", "!"));
		
		System.out.println(str.replaceAll("[a-zA-Z]", "!"));
		
	}

}
