import java.util.Scanner;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String person = sc.next();
        String nextPerson = person.equals("A") ? "B" : "A";
        int totalCola = sc.nextInt();
        int tmp = totalCola;
        int n = 0;
        while (tmp > 2 * n) {
            n++;
            tmp -= (2 * n);
        }
        n += (tmp != 0 ? 1 : 0);
        System.out.println(totalCola <= (n * n) ? person : nextPerson);
    }
}
