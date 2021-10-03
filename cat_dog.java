import java.util.*;

public class cat_dog {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cats = input.nextInt();
        int dogs = input.nextInt();
        int legs = input.nextInt();
        int max = (cats + dogs) * 4;
        int min = 0;
        if (cats <= (2 * dogs)) {
            min = 4 * dogs;
        } else {
            min = (cats - dogs) * 4;
        }
        if (legs % 4 == 0 || (legs <= max && legs >= min)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
