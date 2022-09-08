package javapackage;
import java.util.Scanner;
public class SecondQuestion {

    public static void AddTillNumber(int number) {
        int sum = 1;
        int i;
        int count=0;
        int sub;
        for (i = 3; i <= number; i = i + 2)
        {
        count++;
        if (count == 2)
        {
        sub = sum - i;
        sum = sub;
        count = 0;
        continue;
        }
        sum = sum + i;
        }
        System.out.println("Sum is: " + sum);
        }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number=sc.nextInt();
        AddTillNumber(number);
        sc.close();
    }
}

