class SleepMethod extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        try{
            for(int i=0;i<3;i++){
            System.out.println(n);
            Thread.sleep(2000);
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class ThreadSleep{
    public static void main(String[] args){
        SleepMethod t1=new SleepMethod();
        SleepMethod t2=new SleepMethod();
        SleepMethod t3=new SleepMethod();

        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");

        t1.start();
        t2.start();
        t3.start();
    }
}