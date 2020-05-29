package arrayList;

import java.util.ArrayList;
// import java.util.List;



public class App {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();

		// Adding values
		number.add(10);
		number.add(50);
		number.add(600);

		// Retrieving
		System.out.println(number.get(1));

		// Index for loop iteration
		System.out.println("\nIteration #1..");
		for (int i = 0; i < number.size(); i++) {

			System.out.println(number.get(i));
		}
		// Removing item (Careful !)
		number.remove(number.size()-1);
		
		// This is very Slow because its first item
		number.remove(0);
		
		System.out.println("\nIteration #2..");
		for (Integer value:number) {
			System.out.println(value);
		}
		
		// List Interface...
		// List<String> values = new ArrayList<String>();
		
				
	}
}