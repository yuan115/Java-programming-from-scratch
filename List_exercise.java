package yuan;

import java.util.ArrayList;
import java.util.List;

public class List_exercise {
	
	public static void main(String args[]) {
		String str1 = "test1";
		String str2 = "test2";
		String str3 = "test3";
		
		List<String> list = new ArrayList<String>();
		list.add(str1);
		list.add(str1);
		list.add(str2);
		list.add(str3);
		list.remove("test2");
		
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println(list.get(2));

		
	}

}
