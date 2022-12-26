import java.util.Scanner;

public class Q83 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        System.out.print("*");
        for (int i = 0; i < col; i++) {
            System.out.print("_*");
        }
        System.out.println();
        for (int i = 0; i < row; i++) {
            System.out.print("|");
            for (int j = 0; j < col; j++) {
                System.out.print("_|");
            }
            System.out.println();
        }

    }
}