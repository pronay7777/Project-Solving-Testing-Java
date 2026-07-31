import java.util.Scanner;

@FunctionalInterface
interface Palindrome {
    boolean check(int number);
}

public class Main {

    // Method to check palindrome
    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Method Reference
        Palindrome p = Main::isPalindrome;

        if (p.check(number)) {
            System.out.println(number + " is a Palindrome Number.");
        } else {
            System.out.println(number + " is not a Palindrome Number.");
        }

        sc.close();
    }
}

Output:
Enter a number: 121
121 is a Palindrome Number.

Enter a number: 123
123 is not a Palindrome Number.
