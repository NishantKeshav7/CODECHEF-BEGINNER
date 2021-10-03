import java.util.Scanner;

public class Eidi_problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int ages[] = new int[3];
            int money[] = new int[3];
            for (int i = 0; i < 3; i++) {
                ages[i] = input.nextInt();
            }
            for (int i = 0; i < 3; i++) {
                money[i] = input.nextInt();
            }
            String cond = "FAIR";
            if ((ages[0] == ages[1]) && (money[0] != money[1])) {
                cond = "NOT FAIR";
            } else if ((ages[0] == ages[2]) && (money[0] != money[2])) {
                cond = "NOT FAIR";
            } else if ((ages[1] == ages[2]) && (money[1] != money[2])) {
                cond = "NOT FAIR";
            } else if ((ages[0] < ages[1]) && (money[0] >= money[1])) {
                cond = "NOT FAIR";
            } else if ((ages[0] < ages[2]) && (money[0] >= money[2])) {
                cond = "NOT FAIR";
            } else if ((ages[1] < ages[2]) && (money[1] >= money[2])) {
                cond = "NOT FAIR";
            } else if ((ages[0] > ages[1]) && (money[0] <= money[1])) {
                cond = "NOT FAIR";
            } else if ((ages[0] > ages[2]) && (money[0] <= money[2])) {
                cond = "NOT FAIR";
            } else if ((ages[1] > ages[2]) && (money[1] <= money[2])) {
                cond = "NOT FAIR";
            }
            System.out.println(cond);
        }
        input.close();
    }
}