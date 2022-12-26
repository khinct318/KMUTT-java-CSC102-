import java.util.*;

public class Q77 {
    public static int one(int change) {
        int result = change / 1;
        return result;
    }

    public static int two(int change) {
        int result = change / 2;
        return result;
    }

    public static int five(int change) {
        int result = change / 5;
        return result;
    }

    public static int ten(int change) {
        int result = change / 10;
        return result;
    }

    public static int twenty(int change) {
        int result = change / 20;
        return result;
    }

    public static int fifty(int change) {
        int result = change / 50;
        return result;
    }

    public static int hundred(int change) {
        int result = change / 100;
        return result;
    }

    public static int fhundred(int change) {
        int result = change / 500;
        return result;
    }

    public static int thousand(int change) {
        int result = change / 1000;
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        int paid = scan.nextInt();

        if (amount > paid) {
            System.out.println("Not enough money.");
        } else if (amount == paid) {
            System.out.print("No change for you.");
        } else {
            int change = paid - amount;
            System.out.println("Change: " + change);
            int thousand = 0;
            int fhundred = 0;
            int hundred = 0;
            int fifty = 0;
            int twenty = 0;
            int ten = 0;
            int five = 0;
            int two = 0;
            int one = 0;
            while (change > 0) {
                if (change >= 1000) {
                    thousand += thousand(change);
                    change = change % 1000;
                } else if (change >= 500) {
                    fhundred = fhundred(change);
                    change = change % 500;
                } else if (change >= 100) {
                    hundred += hundred(change);
                    change = change % 100;
                } else if (change >= 50) {
                    fifty += fifty(change);
                    change = change % 50;
                } else if (change >= 20) {
                    twenty += twenty(change);
                    change = change % 20;
                } else if (change >= 10) {
                    ten += ten(change);
                    change = change % 10;
                } else if (change >= 5) {
                    five += five(change);
                    change = change % 5;
                } else if (change >= 2) {
                    two += two(change);
                    change = change % 2;
                } else {
                    one += one(change);
                    change = change % 1;
                }
            }
            System.out.println("1000THB: " + thousand);
            System.out.println("500THB: " + fhundred);
            System.out.println("100THB: " + hundred);
            System.out.println("50THB: " + fifty);
            System.out.println("20THB: " + twenty);
            System.out.println("10THB: " + ten);
            System.out.println("5THB: " + five);
            System.out.println("2THB: " + two);
            System.out.println("1THB: " + one);
        }

    }
}
