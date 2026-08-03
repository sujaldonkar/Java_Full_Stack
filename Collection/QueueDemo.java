import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer>qu=new PriorityQueue<>();
		
//		qu.add(10);
		qu.offer(20);
		qu.offer(100);
		qu.offer(23);
		qu.offer(21);
		
		System.out.println(qu.element());;
		System.out.println(qu.peek());
		System.out.println(qu);
		

	}

}
