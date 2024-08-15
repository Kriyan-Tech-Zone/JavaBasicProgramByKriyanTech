package StringPrograms;

class ConvertCharToString {
  public static void main(String[] args) {
    char ch = 'k';
    String str = Character.toString(ch);
    System.out.println("Char to String is: " + str);

    // Method 2: Using valueOf() method
    String str2 = String.valueOf(ch);
    System.out.println("Char to String is: " + str2);
  }
}