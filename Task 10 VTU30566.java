import java.util.Scanner;

@FunctionalInterface
interface LastDigitSum {
    int calculate(int a, int b);
}

public class Main {

    // Method to find sum of last digits
    public static int findSum(int a, int b) {
        int lastDigit1 = Math.abs(a % 10);
        int lastDigit2 = Math.abs(b % 10);

        return lastDigit1 + lastDigit2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Method Reference
        LastDigitSum sum = Main::findSum;

        int result = sum.calculate(num1, num2);

        System.out.println("Sum of last digits: " + result);

        sc.close();
    }
}

Output:
Enter first number: 123
Enter second number: 456
Sum of last digits: 9
