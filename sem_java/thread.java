//how to write a multi-threaded program in java
//using Thread class and Runnable interface
//thread class
class thread1 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("thread1");
        }
    }
}
//runnable interface
class thread2 implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("thread2");
        }
    }
}
public class thread
{
    public static void main(String[] args)
    {
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        t1.start();
        Thread t3=new Thread(t2);
        t3.start();
    }
}
