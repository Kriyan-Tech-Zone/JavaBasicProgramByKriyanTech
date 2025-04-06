import java.util.Arrays;

public class JavaSortArray {
    public static void main(String[] args) {

        int[] array = new int[] { 15, 48, 19, 82, 12, 76, 63, 85, 97 };

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length - 1; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.err.println(Arrays.toString(array));
        }

        System.err.println("Final Sort Array::"+Arrays.toString(array));
    }
}

/*
 Output::
 
[12, 48, 19, 82, 15, 76, 63, 85, 97]
[12, 15, 48, 82, 19, 76, 63, 85, 97]
[12, 15, 19, 82, 48, 76, 63, 85, 97]
[12, 15, 19, 48, 82, 76, 63, 85, 97]
[12, 15, 19, 48, 63, 82, 76, 85, 97]
[12, 15, 19, 48, 63, 76, 82, 85, 97]
[12, 15, 19, 48, 63, 76, 82, 85, 97]
[12, 15, 19, 48, 63, 76, 82, 85, 97]
[12, 15, 19, 48, 63, 76, 82, 85, 97]

Final Sort Array::[12, 15, 19, 48, 63, 76, 82, 85, 97]


 */