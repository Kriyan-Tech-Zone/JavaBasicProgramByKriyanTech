package beginners;

public class JavaControlStatements {
    public static void main(String[] args) {
      /*  boolean isUserLoggedIn = true;
        if(isUserLoggedIn){
            System.out.println("You are logged in...");
        } else {
            System.out.println("You are not logged in...");
        }*/


      //  int marks = 71;
      /*  if(marks>=40) {
            System.out.println("You are passed...");
        } else {
            System.out.println("You are failed...");
        }*/

    /*
        if(marks>=40){ // true
            if(marks>=70){ // true
                System.out.println("You have distinction...");
            }
        }*/

     /*   String firstName="Kriyan", lastName="Tech", email="kriyantechzone@gmail.com",password="123456";

        if(firstName.isEmpty()){
            System.out.println("enter first name");
        } else if(lastName.isEmpty()){
            System.out.println("enter last name");
        } else if(email.isEmpty()){
            System.out.println("enter your email");
        } else  if(password.isEmpty()){
            System.out.println("enter your password");
        } else {
            System.out.println("your form is filled up...");
        }
        */

        int number = 5;

        switch (number){
            case 2:
                System.out.println("it's number 2");
                break;
            case 5:
                System.out.println("it's number 5");
                break;
            case 10:
                System.out.println("it's number 10");
                break;
            default:
                System.out.println("Not present,,,");
                break;
        }

    }
}
