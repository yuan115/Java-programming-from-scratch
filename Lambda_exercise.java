package yuan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda_exercise {

	public static void main(String args[]) {
		
		Comparator<Integer> com1 = (x, y) -> x-y;
		int result1 = com1.compare(5, 2);
		System.out.println(result1);
		
		
		Comparator<Integer> com2 = Math::subtractExact;
		int result2 = com2.compare(5, 2);
		System.out.println(result2);
		
		
		List<String> list = new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		
		list.forEach(name -> System.out.println(name));
	
	}
}
