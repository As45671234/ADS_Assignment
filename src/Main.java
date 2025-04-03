import java.util.*;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter number of question's answer which you prefer to see: ");
            int n = input.nextInt();
            switch (n) {
                case 1 -> First.main();
                case 2 -> Second.main();
                case 3 -> Third.main();
                case 4 -> Fourth.main();
                case 5 -> Fifth.main();
                case 6 -> Sixth.main();
                case 7 -> Seventh.main();
                case 8 -> Eighth.main();
            }
        }
    }
}
