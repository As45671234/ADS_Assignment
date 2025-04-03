import java.util.*;

public class Third {
    static Scanner input = new Scanner(System.in);
    public static void main(){
        System.out.print("Enter the number:");
        int n = input.nextInt();
        if (n > 1) {
            while (true) {
                System.out.print("Choose approuch to solve, iterative or recursive(i/r):");
                String approuch = input.next();
                if (approuch.equals("r")) {
                    if (recursive(n, n - 1)){
                        System.out.println("Prime");
                    } else {
                        System.out.println("Composite");
                    }
                    break;
                } else if (approuch.equals("i")) {
                    if (iterative(n)){
                        System.out.println("Prime");
                    } else {
                        System.out.println("Composite");
                    }
                    break;
                }
            }
        } else {
            System.out.print("Composite");
        }
    }
    //Recursive
    public static boolean recursive(int n, int denominator){
        if (denominator == 1){
            return true;
        } else if (n % denominator == 0){
            return false;
        } else {
            return recursive(n, denominator - 1);
        }
    }
    //Iterative
    public static boolean iterative(int n){
        for (int i = n - 1; i > 1; i--){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}

