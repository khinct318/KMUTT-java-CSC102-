import java.util.*;

class Q78 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result = 1;
        int i = 0;
        while (i < b) {
            result = a * result;
            i += 1;
        }
        System.out.print(result);
    }
}
