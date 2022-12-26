import java.util.*;

class MaQ75in {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input1 = scan.next().toLowerCase();
        String input2 = scan.next().toLowerCase();

        int Ukrit = 0;
        int Worarat = 0;

        switch (input1) {
            case "rock":
                Ukrit = 1;
                break;
            case "paper":
                Ukrit = 2;
                break;
            case "scissors":
                Ukrit = 3;
                break;
        }
        switch (input2) {
            case "rock":
                Worarat = 1;
                break;
            case "paper":
                Worarat = 2;
                break;
            case "scissors":
                Worarat = 3;
                break;
        }

        String result = "";
        if ((Ukrit == 1) && (Worarat == 3)) {
            result = "Mr.Ukrit Ruckcharti";
        } else if ((Ukrit == 2) && (Worarat == 1)) {
            result = "Mr.Ukrit Ruckcharti";
        } else if ((Ukrit == 3) && (Worarat == 2)) {
            result = "Mr.Ukrit Ruckcharti";
        } else if ((Ukrit == 1) && (Worarat == 1)) {
            result = "Draw";
        } else if ((Ukrit == 2) && (Worarat == 2)) {
            result = "Draw";
        } else if ((Ukrit == 3) && (Worarat == 3)) {
            result = "Draw";
        } else if ((Ukrit == 3) && (Worarat == 1)) {
            result = "Dr.Worarat Krathu";
        } else if ((Ukrit == 1) && (Worarat == 2)) {
            result = "Dr.Worarat Krathu";
        } else if ((Ukrit == 2) && (Worarat == 3)) {
            result = "Dr.Worarat Krathu";
        }
        System.out.print(result);

    }
}
