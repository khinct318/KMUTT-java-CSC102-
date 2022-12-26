import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row = scan.nextInt();
        int col = scan.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = 0;
            }
        }

        int click = scan.nextInt();
        int[][] place = new int[click][2];
        for (int i = 0; i < click; i++) {
            for (int j = 0; j < 2; j++) {
                place[i][j] = scan.nextInt();
            }
        }

        for (int a = 0; a < click; a++) {
            int placeRow = place[a][0];
            int placeCol = place[a][1];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (matrix[i][j] == 3) {
                        matrix[i][j] = 0;
                    }
                }
            }
            if (((placeRow - 1) == -1) && ((placeCol - 1) == -1)) {
                matrix[placeRow][placeCol] += 1;
                matrix[placeRow][placeCol + 1] += 1;
                matrix[placeRow + 1][placeCol] += 1;
            } else if (((placeRow + 1) > (row - 1)) && ((placeCol - 1) == -1)) {
                matrix[placeRow - 1][placeCol] += 1;
                matrix[placeRow][placeCol + 1] += 1;
                matrix[placeRow][placeCol] += 1;
            } else if (((placeRow - 1) == -1) && ((placeCol + 1) > (col - 1))) {
                matrix[placeRow][placeCol] += 1;
                matrix[placeRow][placeCol - 1] += 1;
                matrix[placeRow + 1][placeCol] += 1;
            } else if (((placeRow + 1) > (row - 1)) && ((placeCol + 1) > (col - 1))) {
                matrix[placeRow][placeCol] += 1;
                matrix[placeRow][placeCol - 1] += 1;
                matrix[placeRow - 1][placeCol] += 1;
            } else if ((placeRow - 1) == -1) {
                matrix[placeRow][placeCol - 1] += 1;
                matrix[placeRow][placeCol] += 1;
                matrix[placeRow][placeCol + 1] += 1;
                matrix[placeRow + 1][placeCol] += 1;
            } else if ((placeRow + 1) > (row - 1)) {
                matrix[placeRow - 1][placeCol] += 1;
                matrix[placeRow][placeCol - 1] += 1;
                matrix[placeRow][placeCol] += 1;
                matrix[placeRow][placeCol + 1] += 1;
            } else if ((placeCol - 1) == -1) {
                matrix[placeRow - 1][placeCol] += 1;
                matrix[placeRow][placeCol] += 1;
                matrix[placeRow][placeCol + 1] += 1;
                matrix[placeRow + 1][placeCol] += 1;
            } else if ((placeCol + 1) > (col - 1)) {
                matrix[placeRow - 1][placeCol] += 1;
                matrix[placeRow][placeCol - 1] += 1;
                matrix[placeRow][placeCol] += 1;
                matrix[placeRow + 1][placeCol] += 1;
            } else {
                matrix[placeRow - 1][placeCol] += 1;
                matrix[placeRow][placeCol - 1] += 1;
                matrix[placeRow][placeCol] += 1;
                matrix[placeRow][placeCol + 1] += 1;
                matrix[placeRow + 1][placeCol] += 1;
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // for (int i = 0; i < click; i++) {
        // for (int j = 0; j < 2; j++) {
        // System.out.print(place[i][j] + " ");
        // }
        // System.out.println();
        // }
    }
}
