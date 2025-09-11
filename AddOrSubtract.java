import java.util.Scanner;

public class AddOrSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result;

        if (num1 != num2) {

            if (num1 > num2) {
                result = num1 - num2;
            } else {
                result = num1 + num2;
            }
        } else {
            // กรณีที่ num1 == num2
            result = num1;
        }

        System.out.println("Result = " + result);
        sc.close();
    }
}
