
class MyThread implements Runnable { // Thread manipulation
    Thread thrd; // Reference to thread
    static SumArrayClass sa = new SumArrayClass(); // sum logic
    int result;
    int[] temp;

    MyThread(String name, int[] nums) { // Construct new thrd
        thrd = new Thread(this, name);
        temp = nums;
        thrd.start(); // start thread
    }

    public void run() { // Start execution of new thread
        System.out.println(thrd.getName() + " starting");
        result = sa.sumArray(temp);
        System.out.println(thrd.getName() + "/Sum: " +
                result);
        System.out.println(thrd.getName() + " terminating");
    }
}

class SumArraySync { // Main class
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 /** .., , ,.. **/
        };
        MyThread mt1 = new MyThread("C1", arr);
        MyThread mt2 = new MyThread("C2", arr);
        try {
            mt1.thrd.join();
            System.out.println("C1 joined..");
            mt2.thrd.join();
            System.out.println("C2 joined..");
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted");
        }
    }
}
