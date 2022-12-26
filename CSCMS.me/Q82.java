import java.util.*;

public class Q82 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char alphabet[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.." };

        int whitespace = input.indexOf(" ");
        String sub = "";
        String result = "";
        while (whitespace > -1) {
            sub = input.substring(0, whitespace);
            for (int i = 0; i < morse.length; i++) {
                if (sub.equals(morse[i])) {
                    result += alphabet[i];
                }
            }
            input = input.substring(whitespace + 1);
            whitespace = input.indexOf(" ");
        }
        if (whitespace == -1) {
            for (int i = 0; i < morse.length; i++) {
                if (input.equals(morse[i])) {
                    result += alphabet[i];
                }
            }
        }
        System.out.print(result);

    }
}
