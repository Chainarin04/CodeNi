import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่าตัวเลขจากผู้ใช้
        System.out.print("Enter number 1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = scanner.nextInt();

        // แสดงค่าก่อนสลับ
        System.out.println("Current -> number1 = " + number1 + " and number2 = " + number2);

        // เริ่มการสลับค่า
        System.out.println("Swapping ............");

        int temp = number1; // เก็บค่า number1 ไว้ชั่วคราว
        number1 = number2; // ย้ายค่า number2 ไปใส่ number1
        number2 = temp; // เอาค่าชั่วคราว (ของเดิม number1) มาใส่ number2

        // แสดงค่าหลังสลับ
        System.out.println("Now -> number1 = " + number1 + " and number2 = " + number2);

        scanner.close();
    }
}
