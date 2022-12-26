import java.util.*;

public class Q81 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        char[] array = input.toCharArray();
        char first = array[0];
        char last = array[array.length - 1];
        boolean check = false;
        int count = 0;

        if (array.length % 2 == 1) {
            while (count < (array.length / 2)) {
                if (first == last) {
                    check = true;
                    count += 1;
                    first = array[count];
                    last = array[array.length - count - 1];
                } else {
                    check = false;
                    count = array.length / 2;
                }
            }
        } else {
            while (count < (array.length / 2)) {
                if (first == last) {
                    check = true;
                    count += 1;
                    first = array[count];
                    last = array[array.length - count - 1];
                } else {
                    check = false;
                    count = array.length / 2;
                }
            }
        }

        if (check) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

        // System.out.print(check);
    }
}
