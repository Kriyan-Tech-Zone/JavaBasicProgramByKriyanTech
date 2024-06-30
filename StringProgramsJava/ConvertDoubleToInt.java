package StringProgramsJava;

class ConvertDoubleToInt {
  public static void main(String[] args) {
    double d = 12.33; // primitive type
    int i = (int)d;
    System.out.println("double to int is: " + i);

    // Method 2: Using valueOf() method
    Double d2 = 15.55; // object type
    int i2 = Integer.valueOf(d2.intValue());
    System.out.println("Double to int is: " + i2);
  }
}