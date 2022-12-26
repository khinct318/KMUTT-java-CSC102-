import java.util.Scanner;

public class Q62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        String check = "";
        String s = sc.next().toUpperCase();
        for (int i = 0; i < s.length() - 1; i++) {
            check += s.charAt(i);
            if (check.contains(Character.toString(s.charAt(i + 1)))) {
                check = "";
                count++;
            }
        }
        System.out.println(count);
    }
}