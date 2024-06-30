package javaoperators;

public class OperatorsPrecedenceExampleTwo {
    public static void main(String[] args) {

        int a = 50;
        int b = 10;
       
        int output = ++a + b++;

        System.out.println("Output:" + output);       

    }
}
