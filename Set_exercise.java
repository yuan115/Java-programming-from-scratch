package yuan;

import java.util.HashSet;
import java.util.Set;

public class Set_exercise {
	
	public static void main(String args[]) {
		Set<String> set = new HashSet<String>();
		set.add("test1");
		set.add("test2");
		set.add("test3");
		
		set.remove("test2");
		System.out.println(set.size());
		
		for (String s : set) {
			System.out.println(s);
		}
	}

}
