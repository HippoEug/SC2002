
class ClassA2ab {
	void print(int x, String y) {
		System.out.print("Class A: ");
		System.out.println(x + ", " + y);
	}
}

class ClassB2ab extends ClassA2ab {
	void print(int x) {
		System.out.print("Class B: ");
		System.out.println(x);
	}
}

abstract class ClassC2ab extends ClassA2ab {
	abstract void print(String x, String y);
}

class ClassD2ab extends ClassC2ab {
	void print(String a, String b) {
		System.out.print("Class D: ");
		System.out.println(a + ", " + b);
	}
}

class ClassE2ab extends ClassC2ab {
	void print(String x) {
		System.out.print("Class E: ");
		System.out.println(x);
	}
	
	void print(String x, String y) {
		System.out.print("Class E: ");
		System.out.println(x + ", " + y);
	}
}

class ClassF2ab extends ClassE2ab {
	void print(int x) {
		System.out.print("Class E: ");
		System.out.println(x);
	}
}

class ClassG2ab extends ClassE2ab {
	void print(String x) {
		System.out.print("Class G: ");
		System.out.println(x);
	}
}

public class Q2ab {
	public static void main(String[] args) {
		// Q2bi
		ClassC2ab c = new ClassD2ab();
		c.print("hello", "there");
		
		// Q2bii
		//ClassA2ab a = new ClassC2ab();
		//a.print(1, "there");
		
		// Q2biii
		//ClassA2ab a = new ClassF2ab();
		//a.print("hello", "there");
	}
}
