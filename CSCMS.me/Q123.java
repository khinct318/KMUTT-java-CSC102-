import java.util.*;

public class Q123 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int whitespace = input.indexOf(" ");
        String str1 = input.substring(0, whitespace);
        String str2 = input.substring(whitespace + 1);
        if (str1.equals(str2)) {
            System.out.println("Perfect Match");
        } else if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Partial Match");
        } else {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            if (str1.contains(str2)) {
                System.out.println("Partial Match");
            } else if (str2.contains(str1)) {
                System.out.println("Partial Match");
            } else {
                System.out.println("Not Match");
            }
        }

    }
}
