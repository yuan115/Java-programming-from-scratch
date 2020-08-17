package yuan;

public class method_practice {

	public static void main(String[] args) {
		
		method_practice demo = new method_practice();
		System.out.println(demo.sayHello("Tim"));
	}
	
	
	
	public String sayHello(String name) {
		
		String result = "Hello " + name;
		
		return result;
	}
}
