import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V>extends LinkedHashMap<K,V>{
	private int capacity;
	
	public LRUCache(int capacity) {
		super(capacity,0.75f,true);
		this.capacity=capacity;
		
	}
	
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size()>capacity;
	}
	

	public static void main(String[] args) {
		LRUCache<String,Integer>map=new LRUCache<>(3);
		map.put("Sujal", 10);
		map.put("Sam", 2);
		map.put("Ola", 12);
		map.put("joker", 14);
		
		System.out.println(map);
		

	}

}
