public class JavaStatic {

    public static void main(String[] args) {
        System.out.println(A.i);
        A a = new A();
        System.out.println(A.i);
    }
 
}

class A {
    static int i = 1111;
    static {
        i = i-- - --i;
    }
    {
        i = i++ + ++i;
    }
}