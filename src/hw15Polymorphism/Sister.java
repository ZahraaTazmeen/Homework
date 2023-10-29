package hw15Polymorphism;

/*
Method overloading is when there are different methods with the same name but different parameters.  
 */

public class Sister {

public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
	int total1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5;
	System.out.println("Sister's Age: "+ total1);
		}
	
public void sister(int age1, int age2, int age3, String age4, int age5) {
	int total2 = age1 + age2 + age3 + Integer.parseInt(age4);
	System.out.println("Sister's Age: "+ total2);
	}

public int sister(int age1, int age2, int age3, String age4) {
	int total3 = age1 + age2 + age3 + Integer.parseInt(age4);
	System.out.println("Sister's Age: "+ total3);
	return total3;
	}

public static int sister(int age1, int age2, int age3) {
	int total4 = age1 + age2 + age3;
	System.out.println("Sister's Age: "+ total4);
	return total4;
	}

public final int sister(int age1, int age2) {
	int total5 = age1 + age2;
	System.out.println("Sister's Age: "+ total5);
	return total5;
	}
}
