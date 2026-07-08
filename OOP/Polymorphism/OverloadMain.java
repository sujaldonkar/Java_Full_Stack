class A{
    String name;
    int age;
    void show(){
        System.out.println("Class A");
    }
    void show(String n){
        name=n;
        System.out.println(name);
    }
    
}

class B extends A{
    void show(int a){
        age=a;
        System.out.println(a);
    }}

public class OverloadMain{
    public static void main(String[] args) {
            B c2 =new B();
            // A c1 =new A();
            // c1.name="Ola";
            // c1.age=6;
            // c1.show();
            c2.show("sAM");
            c2.show(26);
            
    }
}