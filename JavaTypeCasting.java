package beginners;

public class JavaTypeCasting {
    public static void main(String[] args) {

       // int price = 50;
      //  System.out.println("price::"+price);
      //  long priceInLong = price;
      //  System.out.println("priceInLong::"+priceInLong);
     //   double priceInDouble = price;
     //   System.out.println("priceInDouble::"+priceInDouble);

        double price = 45.5;
        System.out.println("price::"+price);
        long priceInLong =(long)price;
        System.out.println("priceInLong::"+priceInLong);
        int priceInInt = (int)price;
        System.out.println("price::"+priceInInt);
    }
}
