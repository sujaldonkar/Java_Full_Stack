import java.util.*;
public class SortedMapDemo {

	public static void main(String[] args) {
		SortedMap<Integer,String>map=new TreeMap<>();
		map.put(10, "Ola");
		map.put(2, "Joker");
		map.put(19, "Sam");
		map.put(3, "Despa");
		map.put(7, "Anar");
		map.put(4, "Baku");
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.headMap(10));
		System.out.println(map.tailMap(3));
		System.out.println(map.subMap(3, 10));
		System.out.println(map);
		
	}

}
