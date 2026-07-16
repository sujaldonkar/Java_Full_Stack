class A extends Thread{    
    public void run(){
        for(int i=0;i<5;i++)
    try{
        {
        System.out.println("SAM");
        Thread.sleep(1000);
    }
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
}


public class BasicPrgm{
    public static void main(String[] args) {
        A t=new A();
        t.start();
       try {
            for(int i=0;i<5;i++)
            {
        System.out.println("Max");
        Thread.sleep(1000);
         }       
    } 
    catch(Exception e) {
        e.printStackTrace();
       }
    }
}