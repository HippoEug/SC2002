
class ClassA2c {
	void print(int x, String y) {
		System.out.print("Class A: ");
		System.out.println(x + ", " + y);
	}
}

class ClassB2c extends ClassA2c {
	void print(int x) {
		System.out.print("Class B: ");
		System.out.println(x);
	}
}

class ClassC2c extends ClassA2c {
	void print(String x, String y) {
		System.out.print("Class C: ");
		System.out.println(x + ", " + y);
	}
}

class ClassD2c extends ClassC2c {
	void print(String a, String b) {
		System.out.print("Class D: ");
		System.out.println(a + ", " + b);
	}
}

class ClassE2c extends ClassC2c {
	void print(String x) {
		System.out.print("Class E: ");
		System.out.println(x);
	}
}

class ClassF2c extends ClassE2c {
	void print(int x) {
		System.out.print("Class E: ");
		System.out.println(x);
	}
}

class ClassG2c extends ClassE2c {
	void print(String x) {
		System.out.print("Class G: ");
		System.out.println(x);
	}
}

public class Q2c {
	public static void main(String[] args) {
		// Q2ci
		//ClassC2c c = new ClassD2c();
		//ClassE2c e = c; // Implicit Down-casting, Compile Error
		//ClassE2c e = (ClassE2c)c; // Explicit Down-casting, Runtime Error
		
		// Q2cii
		//ClassB2c b = new ClassE2c();
		//b.print("hello");
		
		// Q2ciii
		//ClassA2c a = new ClassF2c();
		//a.print(12, "there");
		//a.print(88);
		
		// Q2civ
		//ClassA2c a = new ClassC2c();
		//ClassG2c g = (ClassG2c)a;
		//g.print("hello");
		
		// Q2cv
		//ClassA2c a = new ClassC2c();
		//ClassG2c g = (ClassG2c)a;
		//g.print("hello", "there");
		
		// Q2cvi
		ClassA2c a = new ClassF2c();
		ClassC2c f = (ClassC2c)a;
		f.print(88, "there");
	}
}
