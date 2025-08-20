package beginners;

public class JavaForLoopPyramidPartTwo {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            for(int j=5; j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
       /*
        for (char i = 'E'; i >= 'A'; i--) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }*/


    }
}



