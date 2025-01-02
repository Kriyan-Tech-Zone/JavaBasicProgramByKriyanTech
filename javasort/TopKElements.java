package javasort;

import java.util.Arrays;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getHighestK(new int[] { 6,5,4,-1,83, 211, 3, 12, 7, 8, -5, 9, 27 }, 3)));
    }

    public static int[] getHighestK(int[] arr, int k) {
        Queue<Integer> queue = new PriorityQueue<>();

        for (int next : arr) {
            if (queue.size() == k && queue.peek() < next)
                queue.remove();
            if (queue.size() < k)
                queue.add(next);
          System.out.println("Current Queue::"+Arrays.toString(toIntArray(queue)));      
        }

        return toIntArray(queue);
    }

    public static int[] toIntArray(Collection<Integer> source) {
        return source.stream().mapToInt(Integer::intValue).toArray();
    }
}
