public class CheckCharIsVowelOrConsonant {
    public static void main(String[] args) {

        char ch = 'U';

        boolean isVowel = false;

        switch (ch) {
            case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U':
                isVowel = true;
                break;

        }

        if (isVowel) {
            System.out.println("Character " + ch + " is vowel.");
        } else {
            System.out.println("Character " + ch + " is Consonant.");
        }

    }
}
