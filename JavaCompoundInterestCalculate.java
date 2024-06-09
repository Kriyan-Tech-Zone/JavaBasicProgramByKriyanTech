public class JavaCompoundInterestCalculate {

    public static void main(String[] args) {
        int principalAmount = 2000;
        double rate = 0.1;
        int time = 2;
        int number = 12;

        double amount = principalAmount * Math.pow(1 + (rate / number), number * time);
        double compoundInterest = amount - principalAmount;

        System.out.println("Compound Interest gained after " + time + " years is : "+compoundInterest);
        System.out.println("Total Amount after " + time + " years is : "+amount);
    }
}