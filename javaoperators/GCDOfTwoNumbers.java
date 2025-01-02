package javaoperators;

public class GCDOfTwoNumbers {

    public static void main(String[] args) {
        int num1 = 42, num2 = 96;
        int gcd = getGCDNumber(num1, num2);
        System.out.println("The GCD of number " + num1 + " and " + num2 + " is: " + gcd);
    }

    static int getGCDNumber(int num1, int num2) {
        if (num2 == 0)
            return num1;
        return getGCDNumber(num2, num1 % num2);
    }

}
