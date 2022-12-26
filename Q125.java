import java.util.*;

public class Q125 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String title = scan.nextLine();
        int num = scan.nextInt();

        if (num < title.length()) {
            System.out.print(title.substring(0, num) + "...");
        } else {
            System.out.print(title);
        }
    }
}
