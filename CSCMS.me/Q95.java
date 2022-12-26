import java.util.*;

class Q95 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        ArrayList<Double> Rowresult = new ArrayList<Double>();
        ArrayList<Double> Colresult = new ArrayList<Double>();

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        // rowSum
        int rowSum, count = 0;
        while (count < row) {
            for (int i = 0; i < row; i++) {
                rowSum = 0;
                for (int j = 0; j < col; j++) {
                    rowSum += matrix[i][j];
                    // System.out.println(count + " " + i + " " + j);

                }
                count += 1;
                Rowresult.add((double) rowSum);
            }
        }

        // ColSum
        int colSum, count1 = 0;
        while (count1 < col) {
            for (int i = 0; i < col; i++) {
                colSum = 0;
                for (int j = 0; j < row; j++) {
                    colSum += matrix[j][i];
                    // System.out.println(count1 + " " + i + " " + j);

                }
                count1 += 1;
                Colresult.add((double) colSum);
            }
        }
        System.out.println("Average of each row:");
        for (int i = 0; i < Rowresult.size(); i++) {
            Rowresult.set(i, Rowresult.get(i) / col);

            System.out.printf("%.2f ", Rowresult.get(i));
        }
        System.out.println();
        System.out.println("Average of each column:");
        for (int i = 0; i < Colresult.size(); i++) {
            Colresult.set(i, Colresult.get(i) / row);

            System.out.printf("%.2f ", Colresult.get(i));
        }

    }
}
