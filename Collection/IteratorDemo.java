import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		
		list.add(12);
		list.add(24);
		list.add(36);
		list.add(48);
		list.add(60);
		list.add(3);
		list.add(15);
			
		Collections.sort(list,(a,b)->a-b);
		
		Iterator<Integer>itr=list.iterator();
		while(itr.hasNext()) {
			Integer num = itr.next();
			if(num%2==0) {
				itr.remove();
			}
		}
		System.out.println(list);
		
		
	}

}
