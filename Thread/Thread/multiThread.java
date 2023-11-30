import java.lang.Thread;
class myThread1 implements Runnable{
    Thread thrd;
    myThread1(String name){
        thrd = new Thread(this,name);
        thrd.start();
    }
    public void run(){
        System.out.println(thrd.getName()+"Starting");
        for(int i=0;i<10;i++){
            System.out.println(thrd.getName()+"["+i+"]");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println("Thread Interrupted");
            }
        }
        System.out.println(thrd.getName()+" Terminating");
    }
}

public class multiThread {
    public static void main(String[] arg){
        System.out.println("Main Thread starting");

        myThread1 mt1 = new myThread1("C1"); 
        myThread1 mt2 = new myThread1("C2");

        try{
            mt1.thrd.join();
            mt2.thrd.join(); 
        }catch(InterruptedException e){
            System.out.println("Main Thread is interrupted ");
        }
    }

    
}
