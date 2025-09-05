import java.util.Scanner;

public class TestOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number " + number + " is Even.");
        } else {
            System.out.println("The number " + number + " is Odd.");
        }

        System.out.println("End of Program."); // เพิ่มข้อความบอกจบโปรแกรม
        sc.close();
    }
}
