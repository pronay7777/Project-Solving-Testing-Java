import java.util.Scanner;

interface DigitSum {
    int calculate(int number);
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter option (even/odd): ");
        String option = sc.next();

        // Lambda expression for sum of even digits
        DigitSum evenSum = (num) -> {
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;

                if (digit % 2 == 0) {
                    sum += digit;
                }

                num = num / 10;
            }
            return sum;
        };

        // Lambda expression for sum of odd digits
        DigitSum oddSum = (num) -> {
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;

                if (digit % 2 != 0) {
                    sum += digit;
                }

                num = num / 10;
            }
            return sum;
        };

        if (option.equalsIgnoreCase("even")) {
            System.out.println("Sum of even digits: "
                    + evenSum.calculate(number));
        }
        else if (option.equalsIgnoreCase("odd")) {
            System.out.println("Sum of odd digits: "
                    + oddSum.calculate(number));
        }
        else {
            System.out.println("Invalid option!");
        }

        sc.close();
    }
}

Output:
Enter a number: 123456
Enter option (even/odd): even
Sum of even digits: 12

Enter a number: 123456
Enter option (even/odd): odd
Sum of odd digits: 9
