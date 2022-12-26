import java.util.*;

public class Q29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int num = scan.nextInt();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (i % num == 0) {
                result += String.valueOf(input.charAt(i));
            } else {
                result += "";
            }
        }
        System.out.print(result);

    }
}
