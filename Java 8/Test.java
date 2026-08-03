// import java.util.NoSuchElementException;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		Optional<String> name=getName(2);
//		if(name.isPresent()) {
//			System.out.println(name.get());
//		}
//		name.ifPresent(x->System.out.println(x));
		
//		String nameToUsed=name.orElseGet(()->"NA");
		
//		String nameToUsed=name.orElseThrow(()->new NoSuchElementException());
//		System.out.println(nameToUsed);
		
		name.map(String::toUpperCase).ifPresent(System.out::println);
	}
	private static Optional<String> getName(int id) {
		String name="Ram";
		return Optional.of(name);
		
//		String name=null;
//		return Optional.ofNullable(name);
		
//		return Optional.empty();
	}

}
