import java.util.Scanner;

public class birthYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        System.out.print("Enter the current year: ");
        int currentYear = input.nextInt();

        int age = currentYear - birthYear;

        System.out.println("How old are you " + age + " Y");

        input.close();
    }
}
