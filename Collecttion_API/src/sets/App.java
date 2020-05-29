package sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;




public class App {

	public static void main(String[] args) {
		// HashSet does not retain order
		Set<String> set1 = new HashSet<String>();

		// LinkedHashSet remembers the order you added item in...
		// Set<String> linkedset1 = new LinkedHashSet<String>();

		// TreeSet sorts in natural orders..
		// Set<String> treeset1 = new TreeSet<String>();

		System.out.println("HashSet does not retain order...");
		listCall(set1);
		/*
		 * System.out.
		 * println("\nLinkedHashSet remembers the order you added item in......");
		 * listCall(linkedset1);
		 * 
		 * System.out.println("\nTreeSet in natural orders......"); listCall(treeset1);
		 */
	}

	public static void listCall(Set<String> set1) {

		// If the set is empty..

		set1.add("Dog");
		set1.add("Cat");
		set1.add("Mouse");
		set1.add("Elephant");
		set1.add("Got");

		// Adding duplicate item does nothing..
		set1.add("Dog");

		System.out.println("\n" + set1);

		//////////// Iteration ////////////
		for (String element : set1) {

			System.out.println(element);

		}
		////////// Does set contain a given item/////

		if (set1.contains("Cat")) {

			System.out.println("\nContains Cat");
		}
		///////// set2 contains some common elements,and some new.. //////////////////////////
		Set<String> set2 = new TreeSet<String>();

		set2.add("Dog");
		set2.add("Cat");
		set2.add("Giraffe");
		set2.add("Monkey");
		set2.add("Donkey");

		System.out.println(set2);
		
		////////// Intersection //////////////////////////
		Set<String> intersection = new HashSet<String>(set1);
		
		
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		/////////// Difference //////////////
		
		Set<String> difference = new HashSet<String>(set1);
		
		difference.removeAll(set2);
		System.out.println(difference);

	}
}