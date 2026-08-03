import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.Comparator;
import java.util.List;

class Student{
	String name;
	public int age;
	
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
}

//class MyComparator implements Comparator<Student>{
//	public int compare(Student s1,Student s2) {
//		return s2.age-s1.age;
//	}
//}

public class StudentComparator {

	public static void main(String[] args) {
		List<Student> st=new ArrayList<>();
		st.add(new Student("A",80));
		st.add(new Student("zex",70));
		st.add(new Student("Cat",100));
		st.add(new Student("Sam",70));
		
//		Collections.sort(st,(a,b)->a.name.compareTo(b.name));
//		Collections.sort(st,(a,b)->a.age-b.age);
//		Collections.sort(st,new MyComparator());
//		st.sort(Comparator.comparing(s->s.age));
		
//		st.sort(Comparator.comparingInt((Student s)->s.age).reversed());
		
		System.out.println(st.get(0).age);
		
		for(Student s: st) {
			System.out.println(s.name +" "+ s.age);
		}
		

	}

}
