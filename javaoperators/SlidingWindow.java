package javaoperators;

import java.util.Arrays;

public class SlidingWindow {
    public static void main(String[] args) {
        int arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}; // 10-4 = 6
        int k = 4;
         
        //Output: 10 10 10 15 15 90 90  

        System.err.println("ARRAY is Given "+Arrays.toString(arr)+ " find max number for top "+ k);
        System.out.println();
        printMax(arr, k);    
        
    }

    private static void printMax(int[] arr, int k) {
        
        int max;

        for (int i = 0; i < arr.length-k; i++) {
            max = arr[i];

            for(int j=1;j<k;j++) {
                // System.out.println();
                // System.out.print(" ======== Pos::");
                // System.out.print(i+j);
                // System.out.print("value:: "+arr[i+j]);
                // System.out.println(" ======== ");
                if(arr[i+j]>max){
                    max = arr[i+j];
                }
            }
            System.out.print(max + " ");
        }
    }
}
