import java.util.Scanner;

public class Elections {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String str = input.next();
            int snakes = 0, mongoose = 0;
            char arr[] = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                if (arr[i] == 'm') {
                    mongoose++;
                } else {
                    snakes++;
                }
            }
            int snakesEaten = 0;
            for (int i = 0; i < str.length() - 1; i++) {
                if (arr[i] == 's' && arr[i + 1] == 'm') {
                    snakesEaten++;
                    i++;
                } else if (arr[i] == 'm' && arr[i + 1] == 's') {
                    snakesEaten++;
                    i++;
                }
            }
            // System.out.println(snakes + " " + mongoose + " " + snakesEaten);
            if ((snakes - snakesEaten) > mongoose) {
                System.out.println("snakes");
            } else if ((snakes - snakesEaten) < mongoose) {
                System.out.println("mongooses");
            } else {
                System.out.println("tie");
            }
        }
        input.close();
    }
}