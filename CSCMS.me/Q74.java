import java.util.*;

public class Q74{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.next().toLowerCase();
        String last = scan.next().toLowerCase();
        String firstSub = first.substring(0, 1).toUpperCase();
        String lastSub = last.substring(0, 1).toUpperCase();
        System.out.print(firstSub + first.substring(1) + " " + lastSub + last.substring(1));

    }
}
