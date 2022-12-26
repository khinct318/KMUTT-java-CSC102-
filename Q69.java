import java.util.*;

public class Q69 {
    public static int checkLeu(String[] pattern) {
        int leu = 0;
        String Leu[] = new String[] { "CUU", "CUC", "CUA", "CUG" };
        for (int i = 0; i < Leu.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (pattern[j].equals(Leu[i])) {
                    leu += 1;
                }
            }
        }
        return leu;
    }

    public static int checkPro(String[] pattern) {
        int pro = 0;
        String Leu[] = new String[] { "CCU", "CCC", "CCA", "CCG" };
        for (int i = 0; i < Leu.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (pattern[j].equals(Leu[i])) {
                    pro += 1;
                }
            }
        }
        return pro;
    }

    public static int checkHis(String[] pattern) {
        int his = 0;
        String Leu[] = new String[] { "CAU", "CAC" };
        for (int i = 0; i < Leu.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (pattern[j].equals(Leu[i])) {
                    his += 1;
                }
            }
        }
        return his;
    }

    public static int checkGlu(String[] pattern) {
        int glu = 0;
        String Leu[] = new String[] { "CAA", "CAG" };
        for (int i = 0; i < Leu.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (pattern[j].equals(Leu[i])) {
                    glu += 1;
                }
            }
        }
        return glu;
    }

    public static int checkArg(String[] pattern) {
        int arg = 0;
        String Leu[] = new String[] { "CGU", "CGC", "CGA", "CGG" };
        for (int i = 0; i < Leu.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (pattern[j].equals(Leu[i])) {
                    arg += 1;
                }
            }
        }
        return arg;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next().toUpperCase();
        String[] pattern = new String[input.length() / 3];
        int end = 3;
        int count = 0;
        int len = input.length();
        for (int i = 0; i < len / 3; i++) {
            String sub = input.substring(0, end);
            pattern[count] = sub;
            count += 1;
            input = input.substring(end);
        }

        // checkLeu(pattern);
        System.out
                .print(checkLeu(pattern) + " " + checkPro(pattern) + " " + checkHis(pattern) + " " + checkGlu(pattern)
                        + " " + checkArg(pattern));

    }
}
