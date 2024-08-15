package StringPrograms;

import java.util.Arrays;

public class StringsAnagramOrNot {

    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "Care";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.trim().length() == str2.trim().length()) {
            char[] arrayOfStr1 = str1.toCharArray();
            char[] arrayOfStr2 = str2.toCharArray();

            Arrays.sort(arrayOfStr1);
            Arrays.sort(arrayOfStr2);

            if (Arrays.equals(arrayOfStr1, arrayOfStr2) == true) {
                System.out.println(str1 + " and " + str2 + " are anagram Strings.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagram Strings.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram Strings.");
        }

    }
}