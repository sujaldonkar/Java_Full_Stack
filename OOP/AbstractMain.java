abstract class A{
    abstract void display();
    A(){
        System.out.println("Abstract Class Constructor");
    }
}
class B extends A{
    B(){
        super();
        System.out.println("Child Constructor");

    }
    void display(){
        System.out.println("Hello World");
    }
}
public class AbstractMain{
    public static void main(String[] args){
        B b1=new B();
        b1.display();

    }
}