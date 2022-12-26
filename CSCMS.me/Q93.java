import java.util.*;

class Q93 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String[] words = new String[num];
        for (int i = 0; i < words.length; i++) {
            words[i] = scan.next().toLowerCase();
        }

        for (int i = 0; i < words.length; i++) {
            char[] temp = words[i].toCharArray();
            // System.out.print(temp.length);
            // System.out.print(temp[temp.length - 1]);
            String newSen = "";
            for (int j = temp.length; j > 0; j--) {
                newSen = newSen + temp[j - 1];
            }
            words[i] = newSen;
        }

        for (int i = 0; i < words.length; i++) {
            String first = words[i].substring(0, 1).toUpperCase();
            String remain = words[i].substring(1);
            System.out.print(first + remain + " ");
        }
    }
}
