import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalDemo {

	public static void main(String[] args) {
		Predicate<Integer>p=(x)->x%2==0;// Predicate functional interface return boolean value 
		System.out.println(p.test(19));//test()
		
		Function<Integer,Integer>f1=x->x*x;// 
		System.out.println(f1.apply(4));//apply()
		
		Consumer<String>c=s->System.out.println(s);
		c.accept("Hello");//no return value show
		
		Supplier<Double>s=()->Math.random();
		System.out.println(s.get());
	}
	
}
