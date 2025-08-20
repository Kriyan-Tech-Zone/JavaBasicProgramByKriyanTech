package beginners;

public class JavaForLoopPyramidPartThree {
    public static void main(String[] args) {

        for (int i = 5; i >=1 ; i--) {

            for(int space = i-1; space>=1;space--){
                System.out.print(" ");
            }
            for(int j=i;j<=5;j++){ //5,4,3,2,1
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = 1; i <=5 ; i++) {

            for(int space=i-1;space>=1;space--){
                System.out.print(" ");
            }

            for(int j=i;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}






