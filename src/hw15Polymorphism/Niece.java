package hw15Polymorphism;

/*
 *The method is overriding  
 */

public class Niece extends Sister{
	@Override
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		System.out.println("void type sister method");
			}
	
	@Override
	public void sister(int age1, int age2, int age3, String age4, int age5) {
		System.out.println("void parameterized type sister method");
		}
	
	@Override
	public int sister(int age1, int age2, int age3, String age4) {
		System.out.println("return type sister method");
		return 0;
		}
	
	/*@Override
	public static int sister(int age1, int age2, int age3) {
		System.out.println("static return type sister method");
		return 0;
		}
	You can't override this method because it is a static method and you can't override or implement it since
	static is local.

	public final int sister(int age1, int age2) {
		System.out.println("final return type sister method");
		return 0;
		}
		You can't override this method because it is a final method which can't be changed or overloaded.  
		*/
	
}
