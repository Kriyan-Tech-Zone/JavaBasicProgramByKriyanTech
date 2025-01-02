package javaoperators;

public class CheckStringIsNumber {
    public static void main(String[] args) {

        String str1 = "Hello World";
        String str2 = "123";

        try {
            Integer.parseInt(str1);
            System.out.println(str1+" is valid integer number.");
        } catch (NumberFormatException e) {
            System.out.println(str1 + " is not valid integer number.");
        }

        try {
            Integer.parseInt(str2);
            System.out.println(str2+" is valid integer number.");
        } catch (NumberFormatException e) {
            System.out.println(str2 + " is not valid integer number.");
        }
    }
}
