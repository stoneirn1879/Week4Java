import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question3sandbox {

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
			employeeMap.put(002, "Gus");
			employeeMap.put(003, "Amanda");
			employeeMap.put(004, "Aaron");
		
			/* 5.	Create a variable int i = 0; then iterate over ids using an enhanced for loop. Inside the enhanced for loop
			 *  use employeeMap.put() to add a new entry to the map. The entry should consist of a key that is the id in the enhanced
			 *   loop's current iteration, and a value that is the employeeName at position i of the employeeNames ArrayList. Increment
			 *    i so that each iteration grabs the next element in the ArrayList.
			 */
				
			int i = 0;
		
			for (String name : employeeNames) {
			employeeMap.put(i, employeeNames.get(i));
	
			System.out.println("Employee: " + employeeMap.get(i));
			i++;
			
			}
		
			//6.	Once the employeeMap is fully populated, use another enhanced for loop to iterate over the employeeMap.keySet(), 
			//and use the key for each current iteration to print to the console both the current key and its associated value in the map.
		
			Set<Integer> employeeKeys  = employeeMap.keySet();
			for (Integer key : employeeKeys) {
			System.out.println(key + " : " + employeeMap.get(key));
			
			}
					
			//7.	Create a StringBuilder called idsBuilder.
		
			StringBuilder  idsBuilder = new StringBuilder();
		
			//8.	Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.

			for (Integer id : ids) {
			idsBuilder.append(id);
			idsBuilder.append(" - ");
			}
				
			//9.	Print the result of idsBuilder.toString() to the console.
		
			System.out.println(idsBuilder.toString());
			
			//10.	Create another StringBuilder called namesBuilder.
		
			StringBuilder namesBuilder = new StringBuilder();
						
			//11.	Iterate over the employeeNames ArrayList and append each name, followed by a space “ “ to the namesBuilder.
		
			for (String employee : employeeNames) {
			namesBuilder.append(employee);
			namesBuilder.append("  ");
			}
		
			//12.	Print the result of namesBuilder.toString() to the console.

			System.out.println(namesBuilder.toString());
						
	}

}