import java.util.Scanner;

interface Fibonacci {
    int find(int n);
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        // Lambda expression
        Fibonacci fib = (num) -> {
            if (num <= 1) {
                return num;
            }

            int a = 0;
            int b = 1;

            for (int i = 2; i <= num; i++) {
                int c = a + b;
                a = b;
                b = c;
            }

            return b;
        };

        System.out.println("Nth Fibonacci number: " + fib.find(n));

        sc.close();
    }
}

Output:
Enter N: 7
Nth Fibonacci number: 13
