class Student{
    private int age;
    String name;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    
}

public class Encap{
    public static void main(String[] args) {
        Student s1=new Student("Sujal",26);
        System.out.println("Name"+s1.getName());
        System.out.println("Name"+s1.getAge());
    }
}