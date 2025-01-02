import java.util.ArrayList;
import java.util.List;
import java.util.Collections; 

public class FindMinMaxFromList {
    public static void main(String[] args) {
        
        List<Integer> arrayList = new ArrayList<Integer>();

        //adding int elements in arraylist
        arrayList.add(89);
        arrayList.add(32);        
        arrayList.add(44);
        arrayList.add(12);
        arrayList.add(98);

        System.out.println("ArrayList after Adding Elements:: "+arrayList);

        //sort the arraylist
        Collections.sort(arrayList);
        System.out.println("ArrayList after Sorting:: "+arrayList);
        
        //min value from arraylist
        System.out.println("Min value in ArrayList:: "+arrayList.get(0));
        //max value from arraylist
        System.out.println("Max value in ArrayList:: "+arrayList.get(arrayList.size()-1));
    }
}
/*
ArrayList after Adding Elements:: [89, 32, 44, 12, 98]
ArrayList after Sorting:: [12, 32, 44, 89, 98]
Min value in ArrayList:: 12
Max value in ArrayList:: 98
 */
