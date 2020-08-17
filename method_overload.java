package yuan;

public class method_overload {
	
	public static void main(String[] args) {
		method_overload demo = new method_overload();
		System.out.println(demo.add(1, 2));
		
		sub_method_overload sub = new sub_method_overload();
		System.out.println(sub.add(1, 2));
	}

	
	public int add(int i, int j) {
		return i + j;
	}
	
	public int add(byte i, int j) {
		return i + j;
	}
	
	public int add(int i, int j, int k) {
		return i + j + k;
	}
}
