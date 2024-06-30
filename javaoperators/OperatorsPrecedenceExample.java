package javaoperators;

public class OperatorsPrecedenceExample {
    public static void main(String[] args) {
       
        int a = 5;
        int b = 6;
        String str = "Hello";
        
        String output1 = a+b+str;
        String output2 = str+a+b;

        System.out.println("Output1:"+output1);
        System.out.println("Output2:"+output2);

    }
}
