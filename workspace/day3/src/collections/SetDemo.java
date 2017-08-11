package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> states= new HashSet<>();
		
		states.add("Telangana");
		states.add("Andhra Pradesh");
		states.add("Kerala");
		states.add("Tamil Nadu");
		states.add("Jharkhand");
		states.add("Uttarakhand");
		states.add("Tamil Nadu");
		states.remove("Telangana");
		
		System.out.println(states);

	}

}
