package StringPrograms;

public class TotalNumberOfCharactersInString {
    public static void main(String[] args) {
        String str = "Kriyan Tech Zone";

        int count = 0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)!= ' ') {
                count++;
            }
        }

        System.out.println("Total Characters in "+str +" is :: "+count);
    }
    
}