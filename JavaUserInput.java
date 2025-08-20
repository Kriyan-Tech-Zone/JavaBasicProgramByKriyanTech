package beginners;

import java.util.Scanner;

public class JavaUserInput {
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
    
        String userName = objScanner.nextLine();
        System.out.println("Your Name is: " + userName);

        objScanner.close();
    }
}
