class Vehicle{
    public String name;
    protected int weels;
    void output(){
        System.out.println("name"+name);
        System.out.println("weels"+weels);
    }
}
class Cars extends Vehicle{
    public int milage;
    System.out.println()
}

public class InheritMain{
    public static void main(String[] args) {
        Cars c1=new Cars();
        c1.name="Maruti";
        c1.weels=4;
        c1.milage=240;
        c1.output();
    }
}