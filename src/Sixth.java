import java.util.Scanner;

public class Sixth {
    static Scanner input = new Scanner(System.in);

    public static void main() {
        System.out.print("Enter amount of elements: ");
        int n = input.nextInt();
        int[] elements = new int[n];
        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            elements[i] = input.nextInt();
        }
        System.out.println("Reverse order array: ");
        reverse(elements, elements.length - 1);
        System.out.println();
    }
    public static void reverse(int[] arr, int n){
        if (n >= 0) {
            System.out.print(arr[n] + " ");
            reverse(arr, n - 1);
        }
    }
}