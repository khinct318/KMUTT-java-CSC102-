import java.util.*;

public class Q111 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next().toLowerCase();
        String search = scan.next().toLowerCase();

        boolean front = false;
        boolean back = false;

        if (input.contains(search)) {
            if (search.charAt(0) == input.charAt(0)) {
                for (int i = 0; i < search.length(); i++) {
                    if (search.charAt(i) == input.charAt(i)) {
                        front = true;
                    } else {
                        front = false;
                    }
                }
            }
            if (search.charAt(search.length() - 1) == input.charAt(input.length() - 1)) {
                for (int i = 0; i < search.length(); i++) {
                    if (search.charAt(search.length() - 1 - i) == input.charAt(input.length() - 1 - i)) {
                        back = true;
                    } else {
                        back = false;
                    }
                }
            }
            if ((front) && (back)) {
                System.out.print("Front,Back");
            } else if (front) {
                System.out.print("Front");
            } else if (back) {
                System.out.print("Back");
            } else {
                System.out.print("No");
            }

        } else {
            System.out.print("No");
        }
        // System.out.println(input.contains(search));

    }
}
