import java.lang.Thread;
class myThread implements Runnable{
    Thread tr;
    myThread(String name){
        tr = new Thread(this,name);
        tr.start();
    }
    public void run(){
       System.out.println(tr.getName()+"starting"); 
       for(int i=0;i<10;i++){
            System.out.println(tr.getName()+"["+i+"]");
            try{
                Thread.sleep(300);
            }catch(InterruptedException e){
                System.out.println("Child Thread interrupted");
            }
       }
       System.out.println(tr.getName()+" terminatng");
    }
}
class itThread implements Runnable{
    Thread tr;
    itThread(String name){
        tr = new Thread(this,name);
        tr.start();
    }
    public void run(){
        for(int i=0;i<20;i++){
             System.out.println("Again Changes The Thread");
            try{
                Thread.sleep(100);
             }catch(InterruptedException e){
                System.out.println("Child Thread interrupted");
            }
        }
        System.out.println("Change Thread Terminating");
    }
}


public class UseThread {
    public static void main(String[] arg){
        System.out.println("Main thread starting.");
        new myThread("C1");
        new myThread("C2");
        new itThread("C3");
        for(int i=0;i<50;i++){
            System.out.print("M["+i+"]");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println("Main thread interrupted");
            }
        }

    }
}