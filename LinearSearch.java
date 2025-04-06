public class LinearSearch {
    public static void main(String[] args) {

        int[] array = new int[] { 15, 48, 19, 82, 12, 76, 63, 85, 97 };

        int number = 12;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("Number " + number + " Find at index = " + i);
            }
        }
    }
}

/* Output:: 

Number 12 Find at index = 4

*/