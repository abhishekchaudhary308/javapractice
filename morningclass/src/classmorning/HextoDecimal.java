package classmorning;

import java.io.*;


class HextoDecimal {

 static int hexadecimalToDecimal(String hexVal)
 {
    
     int len = hexVal.length();

     int base = 1;

     int dec_val = 0;

   

     for (int i = len - 1; i >= 0; i--) {

        
         if (hexVal.charAt(i) >= '0'
             && hexVal.charAt(i) <= '9') {
             dec_val += (hexVal.charAt(i) - 48) * base;

             base = base * 16;
         }

        
         if (hexVal.charAt(i) >= 'A'
                  && hexVal.charAt(i) <= 'F') {
             dec_val += (hexVal.charAt(i) - 55) * base;

             
             base = base * 16;
         }
     }

     return dec_val;
 }


 public static void main(String[] args)
 {
    
     String hexNum = "BA61";
     System.out.println(hexadecimalToDecimal(hexNum));
 }
}
