package hw15Polymorphism;

/*
Method overloading is when there are different methods with the same name but different parameters.  
 */

public class Sister {
public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
	System.out.println("void type sister method");
		}
	
public void sister(int age1, int age2, int age3, String age4, int age5) {
	System.out.println("void parameterized type sister method");
	}

public int sister(int age1, int age2, int age3, String age4) {
	System.out.println("return type sister method");
	return 0;
	}

public static int sister(int age1, int age2, int age3) {
	System.out.println("static return type sister method");
	return 0;
	}

public final int sister(int age1, int age2) {
	System.out.println("final return type sister method");
	return 0;
	}

}
