public class MaxSumSubArrayExample {
    public static void main(String[] args) {
        int[] array = new int[] { 4, 2, 1, 7, 8, 9, 2, 8, 1, 0 };
        int k = 3;

        int maxSumOfSubArray = findMaxSumSubArray(array, k);
        System.out.println("Max Sum of Sub Array is::" + maxSumOfSubArray);
    }

    private static int findMaxSumSubArray(int[] array, int k) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
   
        for (int i = 0; i < array.length; i++) {
            currentSum = currentSum + array[i];
            System.out.println(" currentSum:: "+currentSum + " at the index::"+i);
            if(i >= k-1){
               maxSum = Math.max(maxSum, currentSum);               
               currentSum -= array[i-(k-1)]; 
            }
        }

        return maxSum;
    }
}
