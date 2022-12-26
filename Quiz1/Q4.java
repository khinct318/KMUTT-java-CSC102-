import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int total;
        String result = "";
        for (int i = 0; i < num; i++) {
            String input = scan.next();
            char[] check = input.toCharArray();
            total = 0;
            for (int j = 0; j < check.length; j++) {
                total += (int) check[j];
            }
            result += String.valueOf((char) (total % 90));
        }

        System.out.print(result);
    }
}
