package javapackage;
import java.util.Scanner;

public class Firstquestion {

  public static int findOddSum(int number) {
	  
     int lastDigit = 0;
     int oddSum = 0;

     while(number!=0) {
         lastDigit = number%10;
         if(lastDigit % 2 != 0) {
        	 oddSum += lastDigit;
         }
         number = number / 10;
      }
      return oddSum;
  }

  public static void main(String[] args) {

      int number = 0;
      int sumOfOdd = 0;
      Scanner scan =  new Scanner(System.in);

      System.out.print("Enter an integer number::");
      number = scan.nextInt();
      sumOfOdd = findOddSum(number);
      if (sumOfOdd%2==0) {
      System.out.println("-1");}
      else
      System.out.println("1");
      scan.close();
  }
}
