import java.util.Scanner;

class Q73 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        if ((str1.contains(" ") && str1.length() > 1000) && (str2.contains(" ") && str2.length() > 1000)) {
            System.out.println("error");
        } else {
            System.out.println("Hello, " + str1 + " " + str2 + ".");
            System.out.println("Welcome to Do or Die exam.");
        }
    }
}
