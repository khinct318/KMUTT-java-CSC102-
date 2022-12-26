import java.util.*;

public class Q79 {
    public static double max(int[] array) {
        Arrays.sort(array);
        return (double) array[array.length - 1];
    }

    public static double min(int[] array) {
        Arrays.sort(array);
        return (double) array[0];
    }

    public static double sum(int[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += (double) array[i];
        }
        return total;
    }

    public static double average(double sum, int num) {
        double avg = sum / num;
        return avg;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.printf("%s%.2f\n", "Summation: ", sum(array));
        System.out.printf("%s%.2f\n", "Average: ", average(sum(array), num));
        System.out.printf("%s%.2f\n", "Max: ", max(array));
        System.out.printf("%s%.2f\n", "Min: ", min(array));
    }
}
