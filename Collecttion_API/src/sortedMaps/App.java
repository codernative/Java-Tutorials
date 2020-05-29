package sortedMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;



public class App {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		testMap(hashMap); // Random no Guaranty for natural order
		testMap(linkedHashMap); // In order how you put objects
		testMap(treeMap); // In natural order (1,2,3,...)
	}
	public static void testMap(Map<Integer, String> map) {
		map.put(4,"Fox");
		map.put(0,"Bus");
		map.put(6,"Car");
		map.put(25,"Elephent");
		map.put(8,"Cat");
		map.put(13,"Mouse");
		
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			
			System.out.println(key + " : "+ value);
		}
		
		
	}

}