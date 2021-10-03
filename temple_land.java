import java.util.Scanner;

public class temple_land {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int num = input.nextInt();
            if (num % 2 == 0) {
                System.out.println("no");
            } else {
                int n = num;
                int mid = (num / 2) + 1;
                int arr1[] = new int[mid + 1];
                for (int i = 1; i < arr1.length; i++) {
                    arr1[i] = i;
                }
                int arr2[] = new int[mid - 1];
                for (int i = 0, j = mid - 1; i < arr2.length; i++, j--) {
                    arr2[i] = j;
                }
                int newarr1[] = new int[arr1.length + arr2.length];
                for (int i = 0; i < arr1.length; i++) {
                    newarr1[i] = arr1[i];
                }
                for (int i = 0, j = mid + 1; i < arr2.length; i++, j++) {
                    newarr1[j] = arr2[i];
                }
                int newarr2[] = new int[n + 1];
                for (int i = 1; i < newarr2.length; i++) {
                    newarr2[i] = input.nextInt();
                }
                if (isEqual(newarr1, newarr2)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }

    static boolean isEqual(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
// /* package codechef; // don't place package name! */

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// /* Name of the class has to be "Main" only if the class is public. */
// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		int T = sc.nextInt();
// 		int N;
// 		while(T>0){
// 		    T--;
// 		    N = sc.nextInt();
// 		    int [] arr=new int [N];
// 		    for(int i=0;i<N;i++){
// 		        arr[i]=sc.nextInt();
// 		    }
// 		    boolean flag=true;
		    
// 		    for(int i=0;i<=(N)/2;i++){
// 		        if(arr[i]!=i+1){
// 		            flag=false;
// 		        }
// 		    }
// 		    int c=0;
// 		     for(int i=N/2+1;i<N;i++){
// 		        if(arr[i]!=N/2-c){
// 		            flag=false;
// 		        }
// 		        c++;
// 		    }
// 		    if(flag && N%2==1){
// 		        System.out.println("yes");
// 		    }
// 		    else{
// 		        System.out.println("no");
// 		    }
		    
// 		}
// 		sc.close();
// 	}
// }
