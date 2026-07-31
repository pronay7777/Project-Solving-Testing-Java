import java.util.Scanner;

public class ArrayPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("All possible pairs:");

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }

        sc.close();
    }
}

Output:
Enter the size of array: 4
Enter array elements:
10
20
30
40
All possible pairs:
(10, 20)
(10, 30)
(10, 40)
(20, 30)
(20, 40)
(30, 40)
