package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return id + " : " + name;
	}

}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		}
		return 0;
	}
}

class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		return -s1.compareTo(s2);

	}
}

public class App {

	public static void main(String[] args) {

		/////////////////////////////// Sorting String ////////////////////////////////
		List<String> animal = new ArrayList<String>();

		animal.add("Cat");
		animal.add("Mouse");
		animal.add("Lion");
		animal.add("Zeebra");
		animal.add("Bear");
		animal.add("Deer");

		// Collections.sort(animal,new StringLengthComparator());

		Collections.sort(animal, new ReverseAlphabeticalComparator());
		for (String animal1 : animal) {

			System.out.println(animal1);
		}

		/////////////////////////////// Sorting Numbers ////////////////////////////////
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(5);
		numbers.add(31);
		numbers.add(16);
		numbers.add(605);
		numbers.add(15);

		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer num1, Integer num2) {

				return -num1.compareTo(num2);
			}

		});

		for (Integer num1 : numbers) {

			System.out.println(num1);
		}
		///////////////////////////// Sorting Arbitrary Objects ////////////////////////////

		List<Person> people = new ArrayList<Person>();

		people.add(new Person(3, "Ajeer"));
		people.add(new Person(1, "Sudeer"));
		people.add(new Person(2, "Sureash"));
		people.add(new Person(4, "Sam"));
		
		// Sort in Order of ID
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				if (p1.getId() > p2.getId()) {
					return 1;
				}
				else if (p1.getId()< p2.getId()) {
					return -1;
				}
				return 0;
			}
		});
		for (Person person1 : people) {

			System.out.println(person1);
		}
		System.out.println("\n");
		// Sort In Order of NAME....
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
			
				return p1.getName().compareTo(p2.getName());
			}
		});
		for (Person person1 : people) {

			System.out.println(person1);
		}
	}
}