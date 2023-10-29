package hw15Polymorphism;

/*
 * The method is overriding is when different methods exist with the same name and parameters but have a 
 * different syntax/logic.
 */

public class Niece extends Sister {

	@Override
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println("Niece's Age: " + total1);
	}

	@Override
	public void sister(int age1, int age2, int age3, String age4, int age5) {
		int total2 = age1 + age2 + age3 + Integer.parseInt(age4);
		System.out.println("Niece's Age: " + total2);
	}

	@Override
	public int sister(int age1, int age2, int age3, String age4) {
		int total3 = age1 + age2 + age3 + Integer.parseInt(age4);
		System.out.println("Niece's Age: " + total3);
		return total3;
	}

	public static int sister(int age1, int age2, int age3) {
		int total4 = age1 + age2 + age3;
		System.out.println("Niece's Age: " + total4);
		return total4;
	}
	//You can't override this method because it is a static method and you can't override or implement it since static is local.
	
	/*
	 * public final int sister(int age1, int age2) { 
	 * int total5 = age1 + age2;
	 * System.out.println("Niece's Age: "+ total5);
	 * return total5; } 
	 * You can't override this method because it is a final method which can't be changed or overloaded.
	 */
}