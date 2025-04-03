import java.util.*;

public class Fifth {
    static Scanner input = new Scanner(System.in);
    public static void main(){
        System.out.print("Enter number a: ");
        int a = input.nextInt();
        System.out.print("Enter number n: ");
        int n = input.nextInt();
        int result = power(a, n);
        System.out.println(a + " power of " + n + " is " + result);
    }
    public static int power(int a, int n){
        if (n == 0) return 1;
        return power(a, n - 1) * a;
    }
}
