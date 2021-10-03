import java.util.Scanner;

public class heaven_to_earth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            float N = input.nextInt();
            float V1 = input.nextInt();
            float V2 = input.nextInt();
            float stairsTime = (float) ((N * Math.sqrt(2)) / V1);
            float elevatorTime = (float) ((N + N) / V2);
            if (stairsTime < elevatorTime) {
                System.out.println("Stairs");
            } else {
                System.out.println("Elevator");
            }
        }
    }
}
