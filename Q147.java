import java.util.*;

public class Q147 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int days = scan.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        int sum = 0;
        int max = 0;
        int maxRow = 0;
        int maxCol = 0;
        for (int d = 0; d < days; d++) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (max < matrix[i][j]) {
                        max = matrix[i][j];
                        maxRow = i;
                        maxCol = j;
                        // sum += max;
                        // System.out.print("-" + matrix[maxRow][maxCol] + "-");
                    }

                    // System.out.print(matrix[i][j] + " ");
                }
            }
            matrix[maxRow][maxCol] = -1;
            sum += max;
            max = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (matrix[i][j] <= 0) {
                        matrix[i][j] = 0;
                    } else {
                        matrix[i][j] -= 1;
                    }
                }
            }

        }
        System.out.print(sum);

    }
}
