package javasort;

public class SumOfTopKElements {
    public static void main(String[] args) {
        int arr[] = { 7, 10, 4, 3, 20, 15 };
        int k = 4;
        int n = arr.length;

        // 7+10+4+3 = 24 //0,1,2,3
        // 10+4+3+20 = 37 //1,2,3,4
        // 4+3+20+15 = 42 //2,3,4,5

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n ; i++) {
            int sum = 0;
                         for (int j = i; j < k + i; j++) {
                 System.out.print(arr[j] + ",");
             }
            System.out.println();
        }

    }
}
