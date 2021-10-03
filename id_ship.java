import java.util.Scanner;

public class id_ship {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            char ch = input.next().charAt(0);
            if (ch == 'B' || ch == 'b') {
                System.out.println("BattleShip");
            } else if (ch == 'C' || ch == 'c') {
                System.out.println("Cruiser");
            } else if (ch == 'D' || ch == 'd') {
                System.out.println("Destroyer");
            } else if (ch == 'F' || ch == 'f') {
                System.out.println("Frigate");
            }
        }
        input.close();
    }
}
