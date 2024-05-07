public class PrimeNumberJava {
    public static void main(String args[]) {
        int number = 8;
        int middle = 0;
        boolean isPrimeNumber = true;

        if (number == 0 || number == 1) {
            System.out.println(number + " is not prime number");
        } else {
            middle = number / 2;
            for (int i = 2; i <= middle; i++) {
                if (number % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                System.out.println(number + " is prime number");
            } else {
                System.out.println(number + " is not prime number");

            }
        }
    }
}
