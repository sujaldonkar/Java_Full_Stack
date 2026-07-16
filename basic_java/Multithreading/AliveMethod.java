class Alive extends Thread{
    String n=Thread.currentThread().getName();
    public void run(){
        System.out.println("Alive Thread");
    }
}

public class AliveMethod{
    public static void main(String[] args){
        Alive t1=new Alive();
        Alive t2=new Alive();
        Alive t3=new Alive();

        t1.start();
        System.out.println(t1.isAlive());

        System.out.println(t2.isAlive());
        t2.start();
    }
}