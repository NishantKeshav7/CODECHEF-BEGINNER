import java.util.*;

public class find_ur_Gift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char arr[] = new char[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }
        char temp = ' ';
        int x = 0, y = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'L' && arr[i] != temp) {
                temp = 'L';
                x -= 1;
            } else if (arr[i] == 'R' && arr[i] != temp) {
                temp = 'R';
                x += 1;
            } else if (arr[i] == 'U' && arr[i] != temp) {
                temp = 'U';
                y += 1;
            } else if (arr[i] == 'D' && arr[i] != temp) {
                temp = 'D';
                y -= 1;
            }
        }
        System.out.println(x + " " + y);
    }
}
// 'L' means to go left, i.e. to the cell (x−1,y)
// 'R' means to go right, i.e. to the cell (x+1,y)
// 'U' means to go up, i.e. to the cell (x,y+1)
// 'D' means to go down, i.e. to the cell (x,y−1)