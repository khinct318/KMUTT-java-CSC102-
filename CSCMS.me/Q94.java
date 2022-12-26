import java.util.*;

class Q94 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextDouble();
        }

        Arrays.sort(array);
        double temp;
        int count = 0;
        int first;
        int last = array.length - 1;
        if (size % 2 == 0) {
            while (count < (array.length / 2)) {
                first = count;
                // last = array.length - 1;
                temp = array[first];
                array[first] = array[last];
                array[last] = temp;
                count = count + 2;
                last = last - 2;
            }
        } else {
            while (count < (array.length / 2) + 1) {
                first = count;
                // last = array.length - 1;
                temp = array[first];
                array[first] = array[last];
                array[last] = temp;
                count = count + 2;
                last = last - 2;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.2f ", array[i]);
        }
    }
}
