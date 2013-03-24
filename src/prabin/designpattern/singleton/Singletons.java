package prabin.designpattern.singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class AlphabeticalStringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		/*
		 * if(s1.length() > s2.length()) return -1; if(s1.length() <
		 * s2.length()) return 1; return 0;
		 */
		return -s1.compareTo(s2);
	}

}

public class Singletons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person p1 = new Person(1, "Bob");
		Person p2 = new Person(3, "Bob");
		Person p3 = new Person(24, "Ram");
		Person p4 = new Person(12, "Hari");
		Person p5 = new Person(8, "Debbyy");

		Map<Person, Integer> map = new HashMap<Person, Integer>();
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p4, 4);
		map.put(p5, 5);

		/*
		 * Map<Integer, String> man = new HashMap<Integer, String>(); man.put(2,
		 * "Ram"); man.put(8, "Crews"); man.put(3, "Nate"); man.put(1,
		 * "Benjamin"); man.put(6, "David");
		 * 
		 * man.compareTo();
		 */

		List<String> set = new ArrayList<String>();
		set.add("Ram");
		set.add("Dog");
		set.add("Reddy");
		set.add("Tigern");
		set.add("hi");

		// Collections.sort(set);

		Collections.sort(set, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}

		});

/*		for (String living : set) {
			System.out.println(living);
		}*/

		// Sorting Objects

		List<Person> people = new ArrayList<Person>();
		people.add(new Person(1, "Ram"));
		people.add(new Person(2, "Reddy"));
		people.add(new Person(3, "Dog"));
		people.add(new Person(4, "Tigern"));
		people.add(new Person(5, "hi"));

		// sort in order of id
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				if (o1.getId() > o2.getId()) {
					return 1;
				} else if (o1.getId() < o2.getId()) {
					return -1;
				}

				return 0;
			}

		});

/*		for (Person person : people) {
			System.out.println(person);
		}*/

		// sort in order of name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}

		});

		for (Person person : people) {
			System.out.println(person);
		}
	}

}
