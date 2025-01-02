package javasort;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {


        int arr[] = {4,56,77,8,33,22,46}; 
        int k = 2;
        Queue<Integer> pQueue = new PriorityQueue<Integer>();

        for(int element:arr){           
            pQueue.add(element);            
        }
 
        // Printing the top element of PriorityQueue
        System.out.println(Arrays.toString(pQueue.toArray()));

        // Printing the top element and removing it
        // from the PriorityQueue container
       // System.out.println(pQueue.poll());

        // Printing the top element again


      // System.out.println(pQueue.peek());
        
    }
}

 