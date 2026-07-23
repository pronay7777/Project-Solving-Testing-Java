import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        if (k > 0 && k <= n) {
            Arrays.sort(arr);

            System.out.println("K-th smallest element is: " + arr[k - 1]);
        } else {
            System.out.println("Invalid value of K");
        }

        sc.close();
    }
}

Output:
Enter number of elements: 5
Enter array elements:
40
10
30
20
50
Enter K: 3
K-th smallest element is: 30
