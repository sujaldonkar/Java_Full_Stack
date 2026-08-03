import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<>();
		map.put(2, "Sujal");
		map.put(20, "Sam");
		map.put(12, "jack");
		map.put(52, "xero");
		
		System.out.println(map.entrySet());
		System.out.println(map.containsKey(12));
		System.out.println(map.containsValue(12));
//		Set<Map.Entry<Integer,String>>entries=map.entrySet();
//		
//		for(Map.Entry<Integer, String>entry:entries) {
//			entry.setValue(entry.getValue().toUpperCase());
//		}
//		System.out.println(map);
		
//		System.out.println(map.get(12));
		for (Integer key : map.keySet()) {
		    System.out.println(key + " " + map.get(key));
		}
		
	}

}

