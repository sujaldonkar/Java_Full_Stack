class A{
    void show(){
        System.out.println("A");
    }
}
class B extends A{
    void show(){
        System.out.println("B");
    }
}

public class OverrideMain{
    public static void main(String[] args) {
        A obj=new B();
        obj.show();
        
    }
}