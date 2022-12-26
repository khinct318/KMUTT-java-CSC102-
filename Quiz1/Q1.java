import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        String sum = "";
        for (int i = 0; i < input.length(); i++) {
            char one = input.charAt(i);
            switch (one) {
                case 'I':
                    sum += "1 ";
                    break;
                case 'V':
                    sum += "5 ";
                    break;
                case 'X':
                    sum += "10 ";
                    break;
                case 'L':
                    sum += "50 ";
                    break;
                case 'C':
                    sum += "100 ";
                    break;
                case 'D':
                    sum += "500 ";
                    break;
                case 'M':
                    sum += "1000 ";
                    break;
            }
        }
        // System.out.print(sum);
        int space = sum.indexOf(" ");
        int total = 0;
        int first = 0;
        int second = 0;
        int len = 0;
        while (space > -1) {
            if (sum.length() != 0) {
                first = Integer.parseInt(sum.substring(0, space));
                sum = sum.substring(space + 1);
                if (sum.length() > 0) {
                    space = sum.indexOf(" ");
                    second = Integer.parseInt(sum.substring(0, space));
                    if (first >= second) {
                        total += first;

                    } else {
                        total += (second - first);
                        sum = sum.substring(space + 1);
                        space = sum.indexOf(" ");
                        len = sum.length();
                    }

                } else {
                    total += first;
                }
            }

        }
        System.out.print(total);

    }
}
