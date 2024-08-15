package StringPrograms;

class ConvertStringToCharJava {
  public static void main(String[] args) {
    String str = "HelloWorld";
    for (int index = 0; index < str.length(); index++) {
      char ch = str.charAt(index);
      System.out.println("Character at Position:" + index + " is: " + ch);
    }
  }
}