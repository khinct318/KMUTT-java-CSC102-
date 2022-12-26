
import java.util.*;

public class Q52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        if (input.length() % 2 == 1) {
            String str1 = input.substring(0, input.length() / 2);
            String str2 = input.substring((input.length() / 2) + 1);
            String result = "";
            for (int i = str1.length(); i > 0; i--) {
                result += String.valueOf(str1.charAt(i - 1));
            }
            result += String.valueOf(input.charAt(input.length() / 2));
            for (int i = str2.length(); i > 0; i--) {
                result += String.valueOf(str2.charAt(i - 1));
            }
            System.out.print(result);
        } else {
            String str1 = input.substring(0, input.length() / 2);
            String str2 = input.substring(input.length() / 2);
            String result = "";
            for (int i = str1.length(); i > 0; i--) {
                result += String.valueOf(str1.charAt(i - 1));
            }
            for (int i = str2.length(); i > 0; i--) {
                result += String.valueOf(str2.charAt(i - 1));
            }
            System.out.print(result);
        }
    }
}
