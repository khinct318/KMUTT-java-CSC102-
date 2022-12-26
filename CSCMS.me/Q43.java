import java.util.*;

public class Q43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] array = input.split(" ");
        int[] IntArray = new int[array.length];
        for (int i = 0; i < IntArray.length; i++) {
            IntArray[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(IntArray);
        int count = 0;

        int check = IntArray[IntArray.length / 2];
        for (int i = 0; i < IntArray.length; i++) {
            if (IntArray[i] < check) {
                count += check - IntArray[i];
            } else if (IntArray[i] > check) {
                count += IntArray[i] - check;
            } else {
                count += 0;
            }
        }

        System.out.print(count);
    }
}
