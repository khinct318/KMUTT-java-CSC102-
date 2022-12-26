import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][][] matrix = new int[5][5][5];

        int num = scan.nextInt();

        int[][] place = new int[num][3];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 3; j++) {
                place[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    matrix[i][j][k] = 1;
                }
            }
        }

        for (int a = 0; a < num; a++) {
            int side = place[a][0];
            int row = place[a][1];
            int col = place[a][2];

            matrix[side][row][col] = 1;
            for (int i = 0; i < 5; i++) {
                matrix[side][i][col] = 1;
                matrix[side][row][i] = 1;
                matrix[i][row][col] = 1;
            }
        }

        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (matrix[i][j][k] == 1) {
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}
