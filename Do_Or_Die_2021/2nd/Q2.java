import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        int change = scan.nextInt();
        int[][] place = new int[change][2];

        for (int i = 0; i < change; i++) {
            for (int j = 0; j < 2; j++) {
                place[i][j] = scan.nextInt();
            }
        }
        int temp;
        for (int a = 0; a < change; a++) {
            int first = place[a][0];
            int last = place[a][1];
            temp = array[first];
            array[first] = array[last];
            array[last] = temp;
        }
        String newString = "";
        for (int i = 0; i < array.length; i++) {
            newString += String.valueOf(array[i]) + " ";
        }
        System.out.print(newString);
    }
}
