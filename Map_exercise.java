package yuan;

import java.util.Map;
import java.util.HashMap;

public class Map_exercise {

	public static void main(String args[]) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("test1", 1);
		map.put("test2", 2);
		map.put("test3", 3);
		
		System.out.println("test2: " + map.get("test2"));
		
		map.remove("test2");
		
		for (String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
	}
}
