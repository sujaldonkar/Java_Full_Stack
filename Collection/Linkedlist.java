import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> link=new LinkedList<>(Arrays.asList(1,2,4,8,13,24,15));
		link.add(40);
		link.addFirst(20);
		link.addLast(200);
		System.out.println(link.get(2));
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		System.out.println(link.removeLast());
//		System.out.println(link.removeIf(x -> x%2==0));
		System.out.println(link);
	
		System.out.println(link.size());
		Collections.sort(link,(a,b)->a-b);
		link.sort((a,b)->a-b);
		link.set(2,80);
		System.out.println(link);

	}

}
