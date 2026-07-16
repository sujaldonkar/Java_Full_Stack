class ThreadJoin extends Thread{
    public void run(){
        String name=Thread.currentThread().getName();
        for(int i=0;i<3;i++){
            System.out.println(name);
        }

    }
}

public class JoinMethod{
    public static void main(String[] args){
        ThreadJoin t1=new ThreadJoin();
        ThreadJoin t2=new ThreadJoin();
        ThreadJoin t3=new ThreadJoin();

        t1.setName("Alpha");
        t2.setName("Beta");
        t3.setName("Charlie");

        t2.start();
        
        try{
            t2.sleep(1000);
            t2.join();
        }catch(Exception e){}

        t1.start();
        t3.start();
    }
}