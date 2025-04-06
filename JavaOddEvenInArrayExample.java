public class JavaOddEvenInArrayExample {
    public static void main(String[] args) {
        int[] array = new int[] { 15, 48, 19, 82, 12, 76, 63, 85, 97 };

        String strOddNumbers = "", strEvenNumbers = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                strEvenNumbers += "\n" + array[i];
            } else {
                strOddNumbers += "\n" + array[i];
            }

        }
        System.out.println("Odd Numbers in Array: " + strOddNumbers);
        System.out.println("Even Numbers in Array: " + strEvenNumbers);
    }
}
/* Output::

Odd Numbers in Array: 
15
19
63
85
97
Even Numbers in Array: 
48
82
12
76

*/