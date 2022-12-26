import java.util.*;

public class Q76 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();
        // int whitespace = input.indexOf(" ");

        char alphabet[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ' };

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "/" };

        char first = ' ';
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            first = input.charAt(i);
            for (int j = 0; j < alphabet.length; j++) {
                if (first == alphabet[j]) {
                    result += morse[j] + " ";
                }
            }
        }
        System.out.print(result.substring(0, result.length() - 1));
    }
}
