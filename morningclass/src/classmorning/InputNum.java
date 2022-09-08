package classmorning;

public class InputNum {
    
    
    public static int prefix() {
        int output= 0;
        String input[] = {"100","111","10100","10","1111","1010"};
        for(int i =0; i<input.length; i++) {
            if(input[i].length()>2) {
                if(input[i].startsWith("10")) {
                    ++output;
                }
            }
        }
        return output;
        
    }
    public static int surfix() {
        int output=0;
        String input[]={"01","01010","1000","10","011"};
        for(int y=0;y<input.length;y++) {
            if(input[y].length()>2) {
                if(input[y].startsWith("10") || input[y].startsWith("01")) {
                    ++output;
                }
            }
            
        }
       return output;
   }
    public static void main(String[] args) {
    	InputNum i = new  InputNum();
        
        System.out.println(i.prefix());
        InputNum y = new  InputNum();
        System.out.println(y.surfix());
    }


 
}
