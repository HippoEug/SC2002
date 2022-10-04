
class ClassA {
	void print(int x, String y) {
		System.out.print("Class A: ");
		System.out.println(x + ", " + y);
	}
}

class ClassB extends ClassA {
	void print(int x) {
		System.out.print("Class B: ");
		System.out.println(x);
	}
}

class ClassC extends ClassA {
	void print(String x, String y) {
		System.out.print("Class C: ");
		System.out.println(x + ", " + y);
	}
}

class ClassD extends ClassC {
	void print(String a, String b) {
		System.out.print("Class D: ");
		System.out.println(a + ", " + b);
	}
}

class ClassE extends ClassC {
	void print(String x) {
		System.out.print("Class E: ");
		System.out.println(x);
	}
}

class ClassF extends ClassE {
	void print(int x) {
		System.out.print("Class E: ");
		System.out.println(x);
	}
}

class ClassG extends ClassE {
	void print(String x) {
		System.out.print("Class G: ");
		System.out.println(x);
	}
}

public class Q1 {
	public static void main(String[] args) {
		ClassF z = new ClassF();
		
		// Q1a
		z.print(9);
		
		// Q1b
		z.print(2, "Cx2002");
		
		// Q1c
		z.print("Object");
		
		// Q1d
		z.print("OODP", "Java");
		
		// Q1e
		//z.print("OODP", 2002);
	}
}
