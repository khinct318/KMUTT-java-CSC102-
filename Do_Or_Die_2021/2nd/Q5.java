import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        for (int i = num; i <= num + 20; i += 2) {
            sum += i;
        }
        System.out.print(sum);
    }
}
