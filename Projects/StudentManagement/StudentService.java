import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class StudentService {

    private ArrayList<Student> students=new ArrayList<>();
    private Scanner sc=new Scanner(System.in);

    public void addStudent(){
        System.out.println("Add Student Information");

        System.out.print("Enter Student ID: ");
        int id=sc.nextInt();

        System.out.print("Enter Student Name: ");
        String name=sc.next();

        System.out.print("Enter Student Email: ");
        String email=sc.next();

        System.out.print("Enter Student Course: ");
        String course=sc.next();

        System.out.print("Enter Student Marks: ");
        int marks=sc.nextInt();

        Student student=new Student(id,name,email,course,marks);

        students.add(student);

        System.out.println("Student added successfully!");
    }

    public void displayStudents(){
        System.out.println("Student List:");
        for(Student student:students){
            System.out.println(student);
        }
    }
    
}
