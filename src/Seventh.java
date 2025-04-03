import java.util.*;

public class Seventh {
    static Scanner input = new Scanner(System.in);
    public static void main() {
        String s = input.next();
        if (isAllDigits(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true; // базовый случай: дошли до конца строки
        if (!Character.isDigit(s.charAt(index))) return false; // если не цифра — сразу false
        return isAllDigits(s, index + 1); // проверяем следующий символ
    }
}