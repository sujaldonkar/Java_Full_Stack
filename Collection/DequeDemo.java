import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {
		Deque<Integer>n=new ArrayDeque<>(Arrays.asList(10,5,7,6,100,7,8,17));
		System.out.println(n);
		
		n.addFirst(1);
		n.addLast(30);
//		n.removeLast();
//		n.removeFirst();
		System.out.println(n.peekLast());
		System.out.println(n.peekFirst());
		System.out.println(n.peek());
		
		System.out.println(n);
		
		
		

	}

}
