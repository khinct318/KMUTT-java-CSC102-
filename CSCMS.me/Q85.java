import java.util.*;

public class Q85 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int[][] matrix = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // System.out.print(matrix[i][j]);
        // }
        // System.out.println();
        // }
        // System.out.println("----------------------------");
        // System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
