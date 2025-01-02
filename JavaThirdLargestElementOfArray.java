public class JavaThirdLargestElementOfArray {
    public static void main(String[] args) {
        // intialize array
        int array1[] = { 1, 8, 7, 5, 4, 9 };
        int array2[] = { 10, 66, 99, 77, 39, 28, 88 };

        // sort the array
        sortTheArray(array1);
        sortTheArray(array2);

        // get the third largest element
        System.out.println("Third Largest of array1: " + array1[array1.length - 3]);
        System.out.println("Third Largest of array2: " + array2[array2.length - 3]);
    }

    public static void sortTheArray(int[] array) {
        int temp, total = array.length;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
/*
Output::
Third Largest of array1: 7
Third Largest of array2: 77
 */