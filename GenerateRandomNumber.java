import java.util.Random;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        
        Random random = new Random();

        int randomNumber1 = random.nextInt(50);
        int randomNumber2 = random.nextInt(100);

        System.out.println("Random Number1::"+randomNumber1);
        System.out.println("Random Number2::"+randomNumber2);

    }
}
