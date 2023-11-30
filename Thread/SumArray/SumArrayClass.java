
// Synchronize access to method for adding array elements
class SumArrayClass { // Sum logic
    private int sum;

    synchronized int sumArray(int[] nums) {
        sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // cumulative sum
            System.out.println(Thread.currentThread().getName() +
                    "/Added: " + nums[i] + "/Total: " + sum);
            try {
                Thread.sleep(10);
            } // Allow task switch
            catch (InterruptedException exc) {
                System.out.println("Thread interrupted");
            }
        }
        return sum;
    }
}