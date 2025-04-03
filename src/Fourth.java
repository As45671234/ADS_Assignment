import java.util.*;

public class Fourth {
    static Scanner input = new Scanner(System.in);
    public static void main(){
        System.out.print("Enter the number:");
        int n = input.nextInt();
        int fub_n = element_fub(n);
        System.out.println(n + " element of Fibonacci is " + fub_n);
    }
    public static int element_fub(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return element_fub(n - 1) + element_fub(n - 2);
    }
}
