interface A{
    void display();
    default void show(){
        System.out.println("Default Method");
    }
}
interface B extends A{
    void call();
}
class C implements B{
    @Override
    public void display(){
        System.out.println("Hii");
    }
    @Override
    public void call(){
        System.out.println("Interface B");
    } 
}
public class InterFaceMain{
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
        obj.call();
        obj.show();
    }
}