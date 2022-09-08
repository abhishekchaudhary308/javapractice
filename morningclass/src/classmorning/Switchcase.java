package classmorning;

public class Switchcase {
    public static void main(String s[])
    {
        char direction = 'N';
        char west = 'W';

        switch(direction)
        {
            case 'N':
                System.out.println("North");
                break;
            case 'E':
                System.out.println("East");
                break;
            case 'W':
                System.out.println("West");
                break;
            case 'S':
                System.out.println("South");
        }
    }
}
