public class FactorialProgramJava {
    public static void main(String[] args) {
        
        int number = 6;

        int factorialValue = 1;

        for(int i=1;i<=number;i++){
            factorialValue = factorialValue*i;
        }

        System.out.println("Factorial of "+number + " is: "+factorialValue);
    }
}
