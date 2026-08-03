import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//
//class MyCompartor implements Comparator<Integer>{
//	public int compare(Integer o1, Integer o2) {
//		return o2-o1;
//	}
//} 


public class UseCompartor {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		
		list1.add(12);
		list1.add(231);
		list1.add(10);
		
//		Collections.sort(list1, new MyCompartor());
		
//		Collections.sort(list1, (a,b)->b-a); // Using Lambda Function
		
		list1.sort(Comparator.comparing(a->a));
		for(int i:list1) {
			System.out.println(i);
		}
		

	}

}
