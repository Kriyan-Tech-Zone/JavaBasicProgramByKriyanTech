public class FibonacciSeriesProgram {
    public static void main(String[] args) {

        int number1 = 0, number2 = 1, number3, i, count = 10;

        System.out.print(number1 + " " + number2);

        for (i = 2; i < count; ++i)
        {
            number3 = number1 + number2;

            System.out.print(" " + number3);

            number1 = number2;
            number2 = number3;
        }

    }
}