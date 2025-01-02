package javasort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        
        int arr[] = {9,5,7,8,3,1,2,6,4};

        int n = arr.length;

        for(int i=0;i<n-1;i++){
           
            for(int j = 0; j<n-i-1; j++){                
                 
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println("array::J  ->"+j+" => "+ Arrays.toString(arr));
            }

            System.out.println("==========================================");
          System.out.println("array::I  ->"+i+" => "+ Arrays.toString(arr));
          System.out.println("==========================================");
        }

        System.out.println("array::"+ Arrays.toString(arr));
    }    
}
