package naturalOderingAndComparableInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Car implements Comparable<Car> {
	private String carName;

	public Car(String name) {
		this.carName = name;
	}

	public String toString() {

		return carName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carName == null) ? 0 : carName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carName == null) {
			if (other.carName != null)
				return false;
		} else if (!carName.equals(other.carName))
			return false;
		return true;
	}

	@Override
	public int compareTo(Car car) {

		// return -carName.compareTo(car.carName);
		int len1 = carName.length();
		int len2 = car.carName.length();

		if (len1 > len2) {
			return 1;
		}
		else if (len1 < len2) {
			return -1;
		}
		else {
			return carName.compareTo(car.carName);
		}
		}
	}

public class App {

	public static void main(String[] args) {

		List<Car> list = new ArrayList<Car>();

		SortedSet<Car> set = new TreeSet<Car>();

		addElements(list);
		addElements(set);

		Collections.sort(list);

		showElements(list);
		System.out.println("\n");
		showElements(set);
	}

	private static void addElements(Collection<Car> col) {

		col.add(new Car("Benz"));
		col.add(new Car("Honda"));
		col.add(new Car("Ford"));
		col.add(new Car("Toyota"));
		col.add(new Car("Nissan"));

	}

	private static void showElements(Collection<Car> col) {

		for (Car list : col) {

			System.out.println(list);
		}
	}
}