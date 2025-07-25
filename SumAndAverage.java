import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        System.out.print("Enter number 3: ");
        int num3 = input.nextInt();

        System.out.print("Enter number 4: ");
        int num4 = input.nextInt();

        System.out.print("Enter number 5: ");
        int num5 = input.nextInt();

        // Process
        int sum = num1 + num2 + num3 + num4 + num5;
        double average = sum / 5.0;

        // Output
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + average);
    }
}
