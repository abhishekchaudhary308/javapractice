package classmorning;

public class PrimeDemo {

    public static void main(String[] args) {
        PrimeChecker Check = (int num) -> {
            if(num<=1) {
                return false;
            }
            for(int i=2;i<num/2;i++) {
                if((num%i)==0)
                    return false;
            }
            return true;
        };
        boolean d = Check.isPrime(4);
        System.out.println("Prime number : " + d);
    }
}
