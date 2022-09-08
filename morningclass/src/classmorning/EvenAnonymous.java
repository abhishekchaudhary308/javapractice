package classmorning;

public class EvenAnonymous {
    // Anonymous Inner Class
public static void main(String[] args) {
EvenChecker check = new EvenChecker() {
@Override 
public boolean isEven(int num) {
if(num%2==0) {
return true;
}
return false;
}
};
boolean f = check.isEven(5);
System.out.println("Number is even: " + f);

}
}