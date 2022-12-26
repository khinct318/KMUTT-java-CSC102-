import java.util.Scanner;

class Q9 {
    public static void main(String[] args) {
        // Write you code here
        Scanner sc = new Scanner(System.in);
        int cart = sc.nextInt();
        int bomb = sc.nextInt();
        boolean check = true;
        if (bomb == 1) {
            if (bomb == cart || bomb == cart - 1) {
                check = false;
            } else {
                for (int i = bomb + 2; i <= cart; i++) {
                    System.out.print(i + " ");
                }
            }

        } else if (bomb == cart) {
            if (cart <= 2) {
                check = false;
            } else {
                for (int i = 1; i < cart - 1; i++) {
                    System.out.print(i + " ");
                }
            }

        } else {
            if (cart == 3 && bomb == cart - 1) {
                check = false;
            } else {
                for (int i = 1; i < bomb - 1; i++) {
                    System.out.print(i + " ");
                }
                for (int i = bomb + 2; i <= cart; i++) {
                    System.out.print(i + " ");
                }
            }

        }
        if (check == false) {
            System.out.println("DIE");
        }
        sc.close();
    }
}