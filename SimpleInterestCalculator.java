public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Simple Interest = (P x T x R)/100

        float principalInterest = 100, time = 1, rate = 8;

        float simpleInterest = (principalInterest * time * rate) / 100;

        System.out.println("Simple Interest:: " + simpleInterest);
    }
}
