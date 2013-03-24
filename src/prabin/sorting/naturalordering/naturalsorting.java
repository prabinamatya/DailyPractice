package prabin.sorting.naturalordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class naturalsorting {

	public static void main(String[] args) {
		List<LivingOrganism> people = new ArrayList<LivingOrganism>();
		
		addPeople(people);
		Collections.sort(people);
		
		System.out.println("Sorting people on the basis of length of name");
		for(LivingOrganism peeps: people) {
			System.out.println(peeps.toString());
		}
	}

	private static void addPeople(List<LivingOrganism> people) {
		people.add(new LivingOrganism(1, "Ram"));
		people.add(new LivingOrganism(2, "David"));
		people.add(new LivingOrganism(8, "He"));
		people.add(new LivingOrganism(7, "Mahesh"));
		people.add(new LivingOrganism(3, "Redditor"));
		people.add(new LivingOrganism(4, "Julie"));
		people.add(new LivingOrganism(9, "Newar"));
	}

}
