import java.util.*;

class Q91 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.next();
        int length = input.length();

        if ((input.charAt(length - 1)) == '7') {
            System.out.print("Unlucky");
        } else {
            double n = Double.parseDouble(input);
            int num = (int) Math.round(n);
            if (num % 7 == 0) {
                System.out.print("Unlucky");
            } else
                System.out.print("Lucky");
        }
    }
}
