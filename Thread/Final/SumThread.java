
// Purpose: Sum of array using threads
import java.util.*;
import java.lang.Thread;
// import java.util.stream.IntStream;

class subClass {
    private int sum;

    synchronized int sumArray(int[] arr) {
        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println(Thread.currentThread().getName() + " Number :: " + arr[i] + " Sum :: " + sum);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Sum Interrupted");
            }
        }
        return sum;
    }
}

class myThread implements Runnable {
        Thread thrd;
        static subClass su = new subClass();
        int res;
        int[] temp;

        myThread(int[] arr) {
            thrd = new Thread(this, "SumThread");
            temp = arr;
            thrd.start();
        }

        public void run() {
            System.out.println(thrd.getName() + " Starting");
            res = su.sumArray(temp);
            System.out.println(thrd.getName() + " Sum :: " + res);
        }
    }

public class SumThread {
    public static void main(String [] args){
        int arr[] ={1,5,5,5,45,34,453,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23};
        myThread mt1 = new myThread(arr);
        try{
            mt1.thrd.join();
        }catch(InterruptedException e){
            System.out.println("Main Thread is Interrupted");
        }

    }
    
}
