import java.util.Arrays;
import java.util.List;

public class MethodRefDemo {
	public static void print(int s) {
		System.out.println(s);
	}

	
	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(1,5,4,8,68,4);
//		l.forEach(MethodRefDemo::print);
		l.forEach(x->System.out.println(x));

	}

}
