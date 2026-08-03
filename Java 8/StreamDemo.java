import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
//		List<String>name=Arrays.asList("Sujal","Sam","Ram","Joker");
//		
//		Stream<String>s=name.stream();
//		name.stream();//create stream
//		
//		int[] arr= {1,2,3,4,5};
//		Arrays.stream(arr);// create stream of array we pass arr name
		
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,23,45,22,1,3,13,13);
//		List<Integer>n=list.stream()
//				.filter(x->x%2!=0)
//				.map(x->x*2)
//				.distinct()
//				.sorted()
//				.collect(Collectors.toList());
//		System.out.println(n);
		
		
		Stream.iterate(1, x->x*2)
//				.map(x->x*2)
				.limit(10)
				.sorted((a,b)->a-b)
//				.peek(System.out::println)
				.forEach(System.out::println);
		
		
		
		
		
//				.peek(x->System.out.print(x))
//				.collect(Collectors.toList());
//			System.out.println(l1);
		
		
			
		
		
//		List<Integer>mapped=n.stream()
//				.map(x->x*x)
//				.collect(Collectors.toList());
//		 System.out.println(mapped);
	}
	

}
