import java.util.Scanner;

public class chef_bored_games {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Num = input.nextInt();
        int sum = 0;
        while (Num > 0) {
            sum += (Num * Num);
            Num -= 2;
        }
        System.out.println(sum);
    }
}