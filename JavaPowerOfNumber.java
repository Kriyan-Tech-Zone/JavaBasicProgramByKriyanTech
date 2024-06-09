public class JavaPowerOfNumber {
    public static void main(String[] args) {
        int number = 2, power = 3;
        long result = 1;

        for (int i = power; i != 0; --i) {
            result *= number;
        }

        System.out.println(number + "^" + power + " = " + result);
    }
}
