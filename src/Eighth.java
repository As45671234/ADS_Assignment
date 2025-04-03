import java.util.*;

public class Eighth {
    static Scanner input = new Scanner(System.in);
    public static void main() {
        System.out.print("Enter number a: ");
        int a = input.nextInt();
        System.out.print("Enter number b: ");
        int b = input.nextInt();
        if (a > b){
            int t = a;
            a = b;
            b = t;
        }
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd(a, b));
    }
    public static int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}