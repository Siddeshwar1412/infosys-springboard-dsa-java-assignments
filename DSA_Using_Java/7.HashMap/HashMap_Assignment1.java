import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.Comparator;

class Tester {
    
	public static List<String> sortSales(Map<String, Integer> sales) {
		List<Entry<String, Integer>> entryList = new ArrayList<>(sales.entrySet());

		Collections.sort(entryList, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
				return e2.getValue().compareTo(e1.getValue()); // descending order
			}
		});

		List<String> sortedNames = new ArrayList<>();
		for (Entry<String, Integer> entry : entryList) {
			sortedNames.add(entry.getKey());
		}
		return sortedNames;
	}

	public static void main(String args[]) {
	    Map<String, Integer> sales = new HashMap<String, Integer>();
		sales.put("Mathew", 50);
		sales.put("Lisa", 76);
		sales.put("Courtney", 45);
		sales.put("David", 49);
		sales.put("Paul", 49);
		
		List<String> employees = sortSales(sales);
		
		System.out.println("Employees in the decreasing order of their sales\n=====================================");
		for (String employeeName : employees) {
			System.out.println(employeeName);
		}
	}
}
