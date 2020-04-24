import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question01 {

	public static void main(String[] args) {
	
		/*
		 * 1.	Create an instance of an ArrayList of String called employeeNames
		 */
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Albert");
		employeeNames.add("Ben");
		employeeNames.add("Aaron");
		employeeNames.add("Gus");
		employeeNames.add("Amanda");
		
		//2.	Create an instance of a HashSet of Integer called ids
		
		Set<Integer> ids = new HashSet<Integer>(); 
		ids.add(000);
		ids.add(001);
		ids.add(002);
		ids.add(003);
		ids.add(004);
		
		//System.out.println(employeeNames);
		
		//3. Create an instance of a HashMap of Integer, String called employeeMap
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		employeeMap.put(000, "Albert");
		employeeMap.put(001, "Ben");
		employeeMap.put(002, "Aaron");
		employeeMap.put(003, "Gus");
		employeeMap.put(004, "Amanda");
		
		
		/* 5.	Create a variable int i = 0; then iterate over ids using an enhanced for loop. Inside the enhanced for loop
		 *  use employeeMap.put() to add a new entry to the map. The entry should consist of a key that is the id in the enhanced
		 *   loop’s current iteration, and a value that is the employeeName at position i of the employeeNames ArrayList. Increment
		 *    i so that each iteration grabs the next element in the ArrayList.
		 */
	
	Set<Integer> ids = employeeMap.keySet();	
		
	int i = 0;
	 
	for (Integer id : employeeMap.keySet()); {
		System.out.println(id);
	}
	
	
			
	
		
		
		
		
	}
}
