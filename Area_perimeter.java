import java.util.Scanner;

public class Area_perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int area = a * b;
        int perimeter = 2 * (a + b);
        if (perimeter > area) {
            System.out.println("Peri");
            System.out.println(perimeter);
        } else if (area == perimeter) {
            System.out.println("Eq");
        } else {
            System.out.println("Area");
            System.out.println(area);
        }
        input.close();
    }
}
