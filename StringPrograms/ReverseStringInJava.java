package StringPrograms;

public class ReverseStringInJava {
    public static void main(String[] args) {
        String str = "KriyanTechZone";

        int index = str.length()-1;

        String strReverse = "";

        for(; index>=0; index--) {            
            strReverse += str.charAt(index);
        }

        System.out.println("Reverse String::"+strReverse);
        
    }
}
