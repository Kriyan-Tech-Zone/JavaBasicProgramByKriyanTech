public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 3, b = 4;

        System.out.println("Numbers before swap a=" + a + ", b=" + b);

        a = a + b;
        b = a - b;
        a = b - a;

        System.out.println("Numbers after swap a=" + a + ", b=" + b);

        System.out.println("Second Way:: Numbers Before swap a=" + a + ", b=" + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Second Way:: Numbers after swap a=" + a + ", b=" + b);

        System.out.println("Third Way:: Numbers before swap a=" + a + ", b=" + b);

        a = (a + b) - (b = a);

        System.out.println("Third Way:: Numbers after swap a=" + a + ", b=" + b);

    }
}
