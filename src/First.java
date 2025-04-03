import java.util.Scanner;

public class First {
    static Scanner input = new Scanner(System.in);
    public static void main() {
        System.out.print("Enter amount of elements: ");
        int n = input.nextInt();
        int[] elements = new int[n];
        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++){
            elements[i] = input.nextInt();
        }
        while (true){
            System.out.print("Choose approuch to solve, iterative or recursive(i/r):");
            String approuch = input.next();
            if (approuch.equals("r")) {
                recursive(elements);
                break;
            } else if (approuch.equals("i")){
                iterative(elements);
                break;
            }
        }
    }
    //Recursive
    public static void recursive(int[] elements){
        int min = minimum_rec(elements, 0);
        System.out.println("Minimum number: " + min);
    }
    public static int minimum_rec(int[] arr, int index){
        if (index == arr.length - 1){
            return arr[index];
        }
        int min = minimum_rec(arr,index + 1);
        if (arr[index] < min){
            return arr[index];
        } else{
            return min;
        }
    }
    //Iterative
    public static void iterative(int[] elements){
        int min = minimum_ite(elements);
        System.out.println("Minimum number: " + min);
    }
    public static int minimum_ite(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
