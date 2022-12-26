import java.util.*;

public class Q49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String newInput = "";
        newInput = input.replaceAll("\\s", "");
        newInput = newInput.replaceAll("-", "");
        // System.out.print(input);
        boolean isogram = true;
        for (int i = 0; i < newInput.length(); i++) {
            for (int j = i + 1; j < newInput.length(); j++) {
                if (newInput.charAt(i) == newInput.charAt(j)) {
                    isogram = false;
                    i = newInput.length();
                    break;
                }
            }
        }

        if (isogram) {
            System.out.println(input + " is an isogram");
        } else {
            System.out.println(input + " is not an isogram");
        }
    }
}
