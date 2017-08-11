
public class NestedClass{
	private int m =  22; // inside of nested

	public NestedClass() {		// constructor
		Nested nested = new Nested();					// object nested created from class Nested
		System.out.println("Outside of Nested; nested.n = " + nested.n);
		nested.f();							// private void class f within nested is called
	}

	private class Nested {
		private int n = 44;

		private void f() {
			System.out.println("Inside of nested; m = " + m); // private int is called
		}
	}

	public static void main(String[] args) { 
		new NestedClass();
	}
}

