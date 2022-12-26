import java.util.*;

public class Q87 {
    public static int sum(int total, String input) {
        int length = input.length();
        if (length == 1) {
            total += Integer.parseInt(String.valueOf(input.charAt(0)));
            return total;
        } else {
            total += Integer.parseInt(String.valueOf(input.charAt(length - 1)));
            input = input.substring(0, length - 1);
            length = length - 1;
            return sum(total, input);

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        int total = 0;
        total = sum(total, input);
        System.out.print(total);
    }
}
