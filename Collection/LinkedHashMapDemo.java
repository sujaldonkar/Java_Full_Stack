import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String ,Integer>map=new LinkedHashMap<>();
//		HashMap<String ,Integer>map=new HashMap<>();
		map.put("Orange", 4);
		map.put("Guava", 2);
		map.put("Apple", 10);
		map.put("Banana", 1);
		
//		map.remove("Apple");
//		System.out.println(map.get("Apple"));
//		System.out.println(map.getOrDefault("Banana", 0));
		
		for(Map.Entry<String, Integer>entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}

	}

}
