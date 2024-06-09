import java.util.Scanner;

public class JavaSumTwoNumbersViaScanner {
    public static void main(String[] args) {

        int number1, number2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        number1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        number2 = sc.nextInt();

        sc.close();

        int sum = number1 + number2;
        System.out.println("Sum of two numbers is: " + sum);
    }
}
