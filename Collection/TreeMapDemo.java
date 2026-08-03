import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String>map=new TreeMap<>();
		map.put(10, "Ola");
		map.put(2, "Joker");
		map.put(19, "Sam");
		map.put(3, "Despa");
		map.put(7, "Anar");
		map.put(4, "Baku");
		
		System.out.println(map.higherKey(10));
		System.out.println(map.lowerKey(4));
		System.out.println(map.ceilingKey(4));
		System.out.println(map.floorKey(10));
		
		System.out.println(map);

	}

}
