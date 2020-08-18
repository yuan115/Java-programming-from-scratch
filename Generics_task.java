package yuan;

import java.util.*;

public class Generics_task<T extends Pet> {
	public T foo;

	public T getFoo() {
		return foo;
	}

	public void setFoo(T foo) {
		this.foo = foo;
	}
	
	public static void main(String args[]) {
		Generics_task<Cat> bar = new Generics_task<Cat>();
		bar.setFoo(new Cat());
		Cat c = bar.getFoo();
	}
	
}

interface Pet{};
class Cat implements Pet{};

