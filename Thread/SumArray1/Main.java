import java.lang.Thread;
import java.util.Scanner;
// import java.util.*;
//Sum logic
class subArrayClass {
    private int sum;

    synchronized int sumArray(int[] arr) {
        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println(Thread.currentThread().getName() + "Number ::" + arr[i] + "Sum ::" + sum);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Sum Interrupted");
            }
        }
        return sum;
    }
}
//Thread for calcualting a sum of array
class myThread implements Runnable {
    Thread thrd;
    static subArrayClass sa = new subArrayClass();
    int res;
    int[] temp;

    myThread(String name, int[] arr) {
        thrd = new Thread(this, name);
        temp = arr;
        thrd.start();
    }

    public void run() {
        System.out.println(thrd.getName() + "Starting");
        res = sa.sumArray(temp);
        System.out.println(thrd.getName() + "Sum :: " + res);
        System.out.println(thrd.getName() + "Terminating");
    }

}
//For calculating a factorial
class nyThread implements Runnable{
    Thread thr;
    int num;

    nyThread(String name,int n){
        thr  = new Thread(this,name);
        num = n;
        thr.start();
    }

    public void run(){
        System.out.println(thr.getName()+"Start Running");
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact=fact * i;
             System.out.println(thr.getName()+" number ::"+i+" Factorial :: "+fact);
             try{
                Thread.sleep(100);
             }catch(InterruptedException e){
                System.out.println("Factorial Exception happend");
             }
        }
        System.out.println("Total Factorial :: "+fact);
         System.out.println(thr.getName()+"Terminating");
    }
    

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // int arr[] = { 1, 2, 3, 4, 5,6,7,8,9 };
        // int n= arr.length;

        myThread mt1 = new myThread("C1", arr);
        // myThread mt2 = new myThread("C2", arr);

        nyThread nt1 = new nyThread("M1",n);

        try {
            mt1.thrd.join();
            System.out.println("C1 is joined");
            // mt2.thrd.join();
            // System.out.println("C2 is joined");
            nt1.thr.join();
            System.out.println("M1 is joined");
        } catch (InterruptedException e) {
            System.out.println("Main Thread is Interrupted");
        }
    }
}
