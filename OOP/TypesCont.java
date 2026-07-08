class Type{
    //non-paramterized constructor
    String name;
    int age;

    // Type(){
    //     name="Sujal";
    //     age=26;
    // }

    //Parametrized constructor
    Type(String name,int age) {
        this.name=name;
        this.age=age;
    }
    
    void output(){
        System.out.println("Name"+name);
        System.out.println("age"+age);
    }
}

public class TypesCont{
    public static void main(String[] args){
        // Type t1=new Type();
        Type t1=new Type("Sam",26);
        t1.output();
    }
}