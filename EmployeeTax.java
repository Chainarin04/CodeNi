import java.util.Scanner;

public class EmployeeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter employee salary: ");
        double salary = input.nextDouble(); // (salary)

        // Process
        double tax = salary * 0.10; // (tax)

        // Output
        System.out.printf("Tax to be paid is %.2f baht.%n", tax);
    }
}
