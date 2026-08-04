public class Student{

    private int id;
    private String name;
    private String email;
    private String course;
    private int marks;

    public Student(int id,String name,String email,String course,int marks){
        this.id=id;
        this.name=name;
        this.email=email;
        this.course=course;
        this.marks=marks;
    }

    //getters methods

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getCourse(){
        return course;
    }
    public int getMarks(){
        return marks;
    }   

    //setters methods

    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setCourse(String course){
        this.course=course;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }

    //we override the toString method to print the student details in a readable format

    public String toString(){
        return "Student{"+
                "id="+id+
                ", name='"+name+'\''+
                ", email='"+email+'\''+
                ", course='"+course+'\''+
                ", marks="+marks+
                '}';
    }

}