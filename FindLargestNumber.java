public class FindLargestNumber {
    public static void main(String[] args) {

        int a = 14, b = 13, c = 12;

        int largestNumber = a > (b > c ? b : c) ? a : b > c ? b : c;

        System.out.println("Largest Number::" + largestNumber);
        
    }
}
