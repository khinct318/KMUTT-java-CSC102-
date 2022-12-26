import java.util.*;

public class Q86 {
    public static int product(int a, int b) {
        if (a < b) {
            return product(b, a);
        } else if (b != 0) {
            return a + product(a, b - 1);
        } else
            return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.print(product(a, b));
    }
}
