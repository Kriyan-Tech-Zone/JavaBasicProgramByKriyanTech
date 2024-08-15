package StringPrograms;

class StringCompareInJava {
  public static void main(String args[]) {

    String str1 = "KriyanTechZone";
    String str2 = "KriyanTechZone";

    // creating strings using new keyword
    String str3 = new String("KriyanTechZone");
    String str4 = new String("KriyanTechZone");

    if (str1 == str2) {
      System.out.println("String str1 and str are equal");
    } else {
      System.out.println("String str1 and str are NOT equal");
    }

    if (str3 == str4) {
      System.out.println("String str3 and str4 are equal");
    } else {
      System.out.println("String str3 and str4 are NOT equal");
    }

  }
}