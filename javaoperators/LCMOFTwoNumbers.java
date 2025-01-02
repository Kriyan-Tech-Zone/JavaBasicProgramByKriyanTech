package javaoperators;

public class LCMOFTwoNumbers {
    public static void main(String[] args) {
     
        int num1 = 15, num2 = 25;
 
        int ans = (num1 > num2) ? num1 : num2;

        while (true) {
            if (ans % num1 == 0 && ans % num2 == 0)
                break;
            ans++;
        }

        System.out.println("LCM of Number " + num1 + " and " + num2
                           + " is : " + ans);

    }
}

