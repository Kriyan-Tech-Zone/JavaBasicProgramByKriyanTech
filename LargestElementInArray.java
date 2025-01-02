public class LargestElementInArray {

    public static void main(String[] args) {

        int[] arr = new int[] { 15, 28, 48, 82, 99, 76, 63, 85, 97};

        int largestElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largestElement)
                largestElement = arr[i];
        }
        System.out.println("Largest element of in array is: " + largestElement);
    }

}
