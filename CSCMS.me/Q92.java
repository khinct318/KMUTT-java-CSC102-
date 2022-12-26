import java.util.*;

class Q92 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        double[] array = new double[size];

        for (int i = 0; i < size; i++) {
            array[i] = scan.nextDouble();
        }
        Arrays.sort(array);
        double secMax = array[array.length - 2];
        double secMin = array[1];
        System.out.printf("%.2f %.2f", secMin, secMax);
    }
}
