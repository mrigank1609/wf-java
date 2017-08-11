package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> names=new LinkedList<>();//new ArrayList<>();
		names.add("Arun");
		names.add("Bikranth");
		names.add("Chethan");
		names.add("Ramu");
		System.out.println(names);
		
		names.add(3,"Kethan");
		System.out.println(names);
		
		System.out.println(names.get(3));
		
		System.out.println(names.remove(2));
		
		System.out.println(names);
		
		for(String s:names){
			System.out.println(s);
		}
		
		Iterator<String> itr= names.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
