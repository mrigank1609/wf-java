package collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> stateCity=new Hashtable<>();// HashMap<>();
		
		
		stateCity.put("Kerala", "Cochin");
		stateCity.put("Telangana", "Hyderabad");
		stateCity.put("West Benagal", "Kolkata");
		stateCity.put("Jharkhand", "Ranchi");
		stateCity.put("Karnataka", "Bangalore");
		stateCity.put("Tamilnadu", "Madurai");
		
		System.out.println(stateCity);
		
		Set<String> states=stateCity.keySet();
		for(String s:states){
			System.out.println(stateCity.get(s));
		}

	}

}
