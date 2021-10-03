// import java.util.Scanner;

// public class forgotton_language {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// int t = input.nextInt();
// while (t-- > 0) {
// int N = input.nextInt();
// int k = input.nextInt();
// String str1[] = new String[N];
// boolean isUsed[] = new boolean[N];
// for (int i = 0; i < N; i++) {
// str1[i] = input.next();
// isUsed[i] = false;
// }
// for (int i = 0; i < k; i++) {
// int l = input.nextInt();
// String str2 = "";
// for (int j = 0; j < l; j++) {
// str2 = input.next();
// for (k = 0; k < N; k++) {
// if (str2 == str1[k]) {
// isUsed[k] = true;
// }
// }
// }
// }
// for (int i = 0; i < N; i++) {
// if (isUsed[i]) {
// System.out.println("YES " + " ");
// } else {
// System.out.println("NO " + " ");
// }
// }
// }
// }
// }