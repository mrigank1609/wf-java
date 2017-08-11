package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchApp {

	public static void main(String[] args) {
		int id=0;
		if(args.length==1){
			id=Integer.parseInt(args[0]);
		}
		List<Emp> empList= new ArrayList<>();
		empList.add(new Emp(100, "James", 50000));
		empList.add(new Emp(101, "Scott", 60000));
		empList.add(new Emp(102, "Arun", 70000));
		empList.add(new Emp(103, "Pavan", 80000));
		empList.add(new Emp(104, "Gilbert", 90000));
		empList.add(new Emp(105, "Tom", 60000));
		empList.add(new Emp(106, "Jerry", 70000));
		
		System.out.println(empList);
		
		boolean empFound=false;
		
		for(Emp e:empList){
			System.out.println("Its searching in "+e+" Now....\n");
			if(e.getEmpId()==id){
				System.out.println(e);
				empFound=true;
			}
		}
		if(!empFound){
			System.out.println("Not Found..");
		}
/*
		Map<String, Collection<Emp>> empMap= new HashMap<>();
		empMap.put("demo", empList);*/
	}

}
