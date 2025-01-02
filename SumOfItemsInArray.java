import java.util.ArrayList;
import java.util.List;

public class SumOfItemsInArray {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();

        // adding int elements in arraylist
        arrayList.add(8);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(9);

        // intialize sum
        int sum = 0;
        for (Integer item : arrayList) {
            sum += item;
        }

        System.out.println("Sum of Arraylist Items::" + sum);
    }
}
/*
 Output
 Sum of Arraylist Items::26
 */