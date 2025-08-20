package beginners;

public class JavaOperators {
    public static void main(String[] args) {

        //int a = 5, b = 2;

       // System.out.println("Postfix decrement::"+ (++a + ++b)); //6 + 8 = 14
       // System.out.println("Prefix decrement::"+ (--a + b--)); //5 + 8 = 13

       // System.out.println("unary minus::"+ -a);

      //  char c = 'b';
      //  System.out.println("unary plus::"+ +c);

      /*  System.out.println("addition::"+(a+b));
        System.out.println("sub::"+(a-b));
        System.out.println("divide::"+(a/b));
        System.out.println("multiply::"+(a*b));
        System.out.println("modulo::"+(a%b));*/

       // System.out.println(7+20*10/5+3-1*4/2);

      //  System.out.println("left shift operator::" + (a<<b)); // 5 * 2^2 = 5*4 = 20
      //  System.out.println("Right shift operator::" + (a>>b)); // 5 / 2^2 = 5/4 = 1
      //  System.out.println("unsinged Right shift operator::" + (a>>>b)); // 5 / 2^2 = 5/4 = 1

      //  int age = 17;
       // System.out.println("age::"+age);

        //int weight = 50;
        //System.out.println("weight::"+weight);
        //weight +=3; // weight = weight+3;
        //weight -=3; // weight = weight-3;
        //weight *=2; // weight = weight*3;
        //System.out.println("weight after::"+weight);

       // int studentWeight1=50, studentWeight2=55;

       // System.out.println("Equals::"+ (studentWeight1 == studentWeight2));
       // System.out.println("Not Equals::"+ (studentWeight1 != studentWeight2));
     //   System.out.println("Greater than::"+ (studentWeight2>studentWeight1)); // 55>50 = true
      //  System.out.println("Less than::"+ (studentWeight2<studentWeight1)); // 55<50 = false
      //  System.out.println("Greater than or equals::"+ (studentWeight2>=studentWeight1)); // 55>=50 = false
      //  System.out.println("Less than or equals::"+ (studentWeight2<=studentWeight1)); // 55<=50 = false

      //  boolean isEngineer = true;
      //  boolean isSingle = false;

     //   System.out.println("Logical And::"+ (isEngineer && isSingle)); // true && false -> false
     //   System.out.println("Logical OR::"+ (isEngineer || isSingle)); // true || false -> true


     //  int marksSubject1 = 40;
    //  int marksSubject2 = 35;

    //   System.out.println("Logical And::"+ (marksSubject1 >=40 && marksSubject2>=40)); // true && false -> false

    //   System.out.println("Logical OR::"+ (marksSubject1 >=40 || marksSubject2>=40)); // true && false -> true

      //  boolean isPassed = false;
       // System.out.println("not failed::"+ !isPassed);

        int a = 8, b = 9;
       // System.out.println("Bitwise & ::"+ (a&b));
       // System.out.println("Bitwise | ::"+ (a|b));
       // System.out.println("Bitwise ^ ::"+ (a^b));
       // System.out.println("Bitwise complement ~ ::"+ ~a);

        int minValue = a<b ? a : b;
        System.out.println("minValue::"+ minValue);


    }
}
