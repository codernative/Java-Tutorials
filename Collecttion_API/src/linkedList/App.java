package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		/*
		 * ArrayList manage Arrays internally. [0][1][2][3] .....
		 * 
		 */
		// USE for remove or add list from last index item
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		/*
		 * LinkeeList consist of elements where each elements
		 * has a reference to  and next element
		 * [0]->[1]->[2] ....
		 *    <-   <-
		 *  */
		// USE for remove or add list from any index
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}

	private static void doTimings(String type, List<Integer> list) {

		long start = System.currentTimeMillis();

		/*
		 * // Add item end of the list for (int i = 0; i < 1E5; i++) { list.add(i); }
		 */

		// Add item elsewhere in the list
		for (int i = 0; i < 1E5; i++) {

			list.add(0, i);
		}

		long end = System.currentTimeMillis();

		System.out.println("Time Take :" + (end - start) + " ms for " + type);
	}
}