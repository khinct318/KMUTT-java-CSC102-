import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String[] array = new String[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.next().toLowerCase();
        }

        String newString = "";
        String first, last, temp = "";
        for (int i = array.length - 1; i >= 0; i--) {
            // System.out.print(array[i] + " ");
            if (array[i].length() > 2) {
                first = String.valueOf(array[i].charAt(0));
                temp = first;
                last = String.valueOf(array[i].charAt(array[i].length() - 1));
                first = last;
                last = temp;
                newString = first + array[i].substring(1, array[i].length() - 1) + last;
            } else {
                newString = array[i];
            }

            System.out.print(newString + " ");

        }
    }
}
