import java.util.Scanner;

public class Second {
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
        float ave = average_sum(elements, 0) / elements.length;
        System.out.println("Average number: " + ave);
    }
    public static float average_sum(int[] arr, int index){
        if (index == arr.length - 1){
            return arr[index];
        }
        float all = arr[index] + average_sum(arr,index + 1);
        return all;
    }
    //Iterative
    public static void iterative(int[] elements){
        float ave = average_ite(elements);
        System.out.println("Average number: " + ave);
    }
    public static float average_ite(int[] arr) {
        float all = 0;
        for (int i = 0; i < arr.length; i++){
            all += arr[i];
        }
        return all / arr.length;
    }
}
