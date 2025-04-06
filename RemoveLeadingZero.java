public class RemoveLeadingZero {
    public static void main(String[] args) {
        
        String strWithZero = "000078945";
        System.out.println("String Without Leading Zero:: "+removeZero(strWithZero));
    }

    static String removeZero(String str){
        try{
            int length = str.length();
            int index = 0;
            
            while (index < length && str.charAt(index) == '0') {
                index++;
            }

            return str.substring(index, length);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return str;
    }
}

/*
 Output::
 
 String Without Leading Zero:: 78945

 */