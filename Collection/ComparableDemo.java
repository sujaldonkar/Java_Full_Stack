import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Studen implements Comparable<Studen>{
	private String name;
	private int age;
	
	public Studen(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public int compareTo(Studen s) {
		return this.age-s.age;
	}
	
	public String toString() {
		return name + " "+age;
	}
}

	


public class ComparableDemo {

	public static void main(String[] args) {
		List<Studen>lis=new ArrayList<>();
		lis.add(new Studen("Sam",10));
		lis.add(new Studen("Sujal",8));
		lis.add(new Studen("Ram",2));
		
		Collections.sort(lis);
		System.out.println(lis);
		

	}

}
