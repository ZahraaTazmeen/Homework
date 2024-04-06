package hw20CountingInArray;

import java.util.Iterator;

public class findingSmallestNumber {
	public static void main(String[] args) {
	int [] number = {2, 12, 10, 1, 50};
	
	int smallest = number [0];
	
	for(int i = 0; i < number.length; i++) {
		if (number[i]<smallest) {
	smallest = number [i];
	
	System.out.println(smallest);
			}
		}
	}
}